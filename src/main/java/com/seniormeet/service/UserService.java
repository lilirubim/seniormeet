package com.seniormeet.service;

import com.seniormeet.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {


    List<User> findUsers();

    User findById(Long id);
}
