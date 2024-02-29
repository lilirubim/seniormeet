package com.seniormeet.service;

import com.seniormeet.model.Group;
import com.seniormeet.model.Hobby;
import com.seniormeet.model.User;

import java.util.List;


public interface UserService {


    List<User> findUsers();

    User findById(Long id);

    User createUser(User user);

    User updateUser(Long id, User user);

    boolean deleteUser(Long id);

    void addUserToGroup(Long userId, Long groupId);

    List<Group> getUserGroups(Long userId);

    List<Hobby> getUserHobbies(Long userId);

    void addHobbyToUser(Long userId, Long hobbtId);
}
