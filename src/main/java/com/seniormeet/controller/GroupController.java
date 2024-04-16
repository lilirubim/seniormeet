package com.seniormeet.controller;

import com.seniormeet.model.Comment;
import com.seniormeet.model.Group;
import com.seniormeet.model.User;
import com.seniormeet.repository.GroupRepository;
import com.seniormeet.repository.InteractionRepository;
import com.seniormeet.service.FileService;
import com.seniormeet.service.GroupService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Set;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@AllArgsConstructor
@RestController
@CrossOrigin("*")
@Slf4j
@RequestMapping("/groups")
public class GroupController {

    private GroupService groupService;
    private final InteractionRepository interactionRepository;
    private FileService fileService;
    private GroupService groupRepository;


    @GetMapping
    public ResponseEntity<List<Group>> findAll() {
        List<Group> groups = groupService.findGroup();
        log.info("REST request to findAll groups");
        return ResponseEntity.ok(groups);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Group> findById(@PathVariable Long id){
        Group group = groupService.findById(id);
        if (group!=null)
            return ResponseEntity.ok(group);
        return ResponseEntity.notFound().build();
    }

    @GetMapping("{groupId}/users")
    public ResponseEntity<List<User>> getGroupUsers(@PathVariable Long groupId){
        List<User> users = groupService.getGroupUsers(groupId);
        return ResponseEntity.ok(users);
    }


    @PostMapping("create")
    //public ResponseEntity<Group> create(@RequestBody Group group) {
    //return ResponseEntity.ok(groupService.save(group));
    //}
    public ResponseEntity<Group> create(
            @RequestParam(value = "photo", required = false) MultipartFile file,
            Group group){

        if(file != null && !file.isEmpty()) {
            String fileName = fileService.store(file);
            group.setPhotoUrl(fileName);
        } else {
            group.setPhotoUrl("avatar.png");
        }
        Group createdGroup = groupService.createGroup(group);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdGroup);

    }

    @PutMapping("/{id}")
    public ResponseEntity<Group> updateGroup(@PathVariable Long id, @RequestBody Group group) {
        Group updateGroup = groupService.updateGroup(id, group);
        if (updateGroup != null) {
            return ResponseEntity.ok(updateGroup);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGroup(@PathVariable Long id) {
        boolean deleted = groupService.deleteGroup(id);
        if (deleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
