package com.seniormeet.service;

import com.seniormeet.model.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {


    List<User> findUsers();

    User findById(Long id);

    User createUser(User user);

    User updateUser(Long id, User user);

    boolean deleteUser(Long id);
}
