package com.seniormeet.controller;

import com.seniormeet.model.Group;
import com.seniormeet.model.Hobby;
import com.seniormeet.model.User;
import com.seniormeet.service.GroupService;
import com.seniormeet.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;
    private final GroupService groupService;

    public UserController(UserService userService, GroupService groupService) {
        this.userService = userService;
        this.groupService = groupService;
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
    public ResponseEntity<User> createUser(@RequestBody User user, @RequestParam("photo") MultipartFile file) throws IOException {
        User createdUser = userService.createUser(user, file);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
    }

//    @PostMapping("/upload")
//    public ResponseEntity<String> uploadPhoto(@RequestParam("photo") MultipartFile file) throws IOException {
//        User u = userService.savePhoto(file);
//        if (u!=null)
//            return ResponseEntity.ok("Foto subida correctamente");
//        else
//            return ResponseEntity.status(500).body("Error al guardar la imagen");
//    }

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
//esta parte la hizo ALAN no la borren.
    @GetMapping("add-group/{id}")
    public ResponseEntity<User> addGroupToUser(@PathVariable Long id) {
        // TODO recuperar el usuario de base de datos gracias a la Security (lo hará Alan en clase)
        User user = new User();
        Group group = groupService.findById(id);
        if(!user.getGroups().contains(group)) {
            user.getGroups().add(group);
            return ResponseEntity.ok(userService.updateUser(user.getId(), user));
        }

        return ResponseEntity.notFound().build();

    }
}
