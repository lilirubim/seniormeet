package com.seniormeet.controller;

import com.seniormeet.model.Group;
import com.seniormeet.model.Hobby;
import com.seniormeet.model.User;
import com.seniormeet.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        List<User> users = userService.findUsers();
        return ResponseEntity.ok(users);
    }

    @GetMapping("{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {
        User user = userService.findById(id);
        if (user!=null)
            return ResponseEntity.ok(user);
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/{userId}/groups")
    public ResponseEntity<List<Group>> getUserGroups(@PathVariable Long userId) {
        List<Group> groups = userService.getUserGroups(userId);
        return ResponseEntity.ok(groups);
    }

    @GetMapping("/{userId}/hobbies")
    public ResponseEntity<List<Hobby>> getUserHobbies(@PathVariable Long userId) {
        List<Hobby> hobbies = userService.getUserHobbies(userId);
        return ResponseEntity.ok(hobbies);
    }

    @PostMapping("/{userId}/groups/{groupId}")
    public ResponseEntity<String> addUserToGroup(@PathVariable Long userId, @PathVariable Long groupId) {
        userService.addUserToGroup(userId, groupId);
        return ResponseEntity.ok("User added to group successfully");
    }

    @PostMapping("/{userId}/hobbies/{hobbyId}")
    public ResponseEntity<String> addHobbyToUser(@PathVariable Long userId, @PathVariable Long hobbyId) {
        userService.addHobbyToUser(userId, hobbyId);
        return ResponseEntity.ok("Hobby added to user successfully");
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User createdUser = userService.createUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User user) {
        User updatedUser = userService.updateUser(id, user);
        if (updatedUser != null) {
            return ResponseEntity.ok(updatedUser);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        boolean deleted = userService.deleteUser(id);
        if (deleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
