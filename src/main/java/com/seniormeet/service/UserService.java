package com.seniormeet.service;

import com.seniormeet.model.Group;
import com.seniormeet.model.Hobby;
import com.seniormeet.model.User;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;


public interface UserService {


    List<User> findUsers();

    User findById(Long id);

    User createUser(User user, MultipartFile file) throws IOException;

    User createUser(User user) throws IOException;

    User updateUser(Long id, User user);

    boolean deleteUser(Long id);

    void addUserToGroup(Long userId, Long groupId);

    List<Group> getUserGroups(Long userId);

    List<Hobby> getUserHobbies(Long userId);

    void addHobbyToUser(Long userId, Long hobbtId);


    //User savePhoto(MultipartFile file) throws IOException;
}
