package com.seniormeet.service;

import com.seniormeet.model.Group;
import com.seniormeet.model.Hobby;
import com.seniormeet.model.User;
import com.seniormeet.repository.GroupRepository;
import com.seniormeet.repository.HobbyRepository;
import com.seniormeet.repository.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {


    private UserRepository userRepository;
    private GroupRepository groupRepository;
    private HobbyRepository hobbyRepository;

    public UserServiceImpl(UserRepository userRepository, GroupRepository groupRepository, HobbyRepository hobbyRepository) {
        this.userRepository = userRepository;
        this.groupRepository = groupRepository;
        this.hobbyRepository = hobbyRepository;
    }

    @Override
    public List<User> findUsers() {

        return userRepository.findAll();
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElse(null);
    }


    @Override
    public User createUser(User user, MultipartFile file) throws IOException {
        System.out.println("Bytes1: "+ file.getBytes());
        user.setPhoto(file.getBytes());
        System.out.println("Bytes2: "+ file.getBytes());
        return userRepository.save(user);
    }


    @Override
    public User updateUser(Long id, User user) {
        Optional<User> userOptional = userRepository.findById(id);
        if (userOptional.isPresent()) {
            User existingUser = userOptional.get();
            existingUser.setFirstName(user.getFirstName());
            existingUser.setEmail(user.getEmail());
            // Actualizar otras propiedades según sea necesario
            return userRepository.save(existingUser);
        } else {
            return null;
        }

    }

    @Override
    public boolean deleteUser(Long id) {
        Optional<User> userOptional = userRepository.findById(id);
        if (userOptional.isPresent()) {
            userRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }


    @Transactional
    public void addUserToGroup(Long userId, Long groupId) {
        User user = userRepository.findById(userId).orElseThrow(() -> new EntityNotFoundException("User not found"));
        Group group = groupRepository.findById(groupId).orElseThrow(() -> new EntityNotFoundException("Group not found"));
        user.getGroups().add(group);
        group.getUsers().add(user);
        userRepository.save(user);
        groupRepository.save(group);
    }

    public List<Group> getUserGroups(Long userId) {
        User user = userRepository.findById(userId).orElseThrow(() -> new EntityNotFoundException("User not found"));
        return user.getGroups();
    }

    public List<Hobby> getUserHobbies(Long userId) {
        User user = userRepository.findById(userId).orElseThrow(() -> new EntityNotFoundException("User not found"));
        return user.getHobbies();
    }

    @Transactional
    public void addHobbyToUser(Long userId, Long hobbyId) {
        User user = userRepository.findById(userId).orElseThrow(() -> new EntityNotFoundException("User not found"));
        Hobby hobby = hobbyRepository.findById(hobbyId).orElseThrow(() -> new EntityNotFoundException("Hobby not found"));
        user.getHobbies().add(hobby);
        hobby.getUsers().add(user);
        userRepository.save(user);
        hobbyRepository.save(hobby);
    }

//    @Override
//    public User savePhoto(MultipartFile file) throws IOException {
//        System.out.println(file.getName());
//        User newUser = new User("John333", "Doe333", "john.doe@example.com", "secretpassword", "+1234567890", null, null);
//        newUser.setPhoto(file.getBytes());
//        System.out.println("Bytes2: "+ file.getBytes());
//        return userRepository.save(newUser);
////        return false;
//    }

}
