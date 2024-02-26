package com.seniormeet.controller;

import com.seniormeet.model.Group;
import com.seniormeet.model.User;
import com.seniormeet.repository.GroupRepository;
import com.seniormeet.repository.InteractionRepository;
import com.seniormeet.service.GroupService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@AllArgsConstructor
@RestController
@RequestMapping("/groups")
public class GroupController {

    private GroupService groupService;
    private final InteractionRepository interactionRepository;


    @GetMapping
    public ResponseEntity<List<Group>> findAll() {
        List<Group> groups = groupService.findGroup();
        return ResponseEntity.ok(groups);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Group> findById(@PathVariable Long id){
        Group group = groupService.findById(id);
        return ResponseEntity.ok(group);
    }


    @PostMapping("/create")
    public ResponseEntity<Group> create(@RequestBody Group group) {
        return ResponseEntity.ok(groupService.save(group));
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
