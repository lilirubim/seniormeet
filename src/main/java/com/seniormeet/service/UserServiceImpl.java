package com.seniormeet.service;

import com.seniormeet.model.User;
import com.seniormeet.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {


    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
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
    public User createUser(User user) {
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
}
