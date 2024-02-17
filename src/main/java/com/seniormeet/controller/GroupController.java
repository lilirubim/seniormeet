package com.seniormeet.controller;

import com.seniormeet.model.Group;
import com.seniormeet.repository.GroupRepository;
import com.seniormeet.service.GroupService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/groups")
public class GroupController {

    private GroupService groupService;

    public GroupController(GroupService groupService) {
        this.groupService = groupService;
    }

    @GetMapping
    public ResponseEntity<List<Group>> findAll() {
        List<Group> groups = groupService.findGroup();
        return ResponseEntity.ok(groups);
    }
    // hay que agregar get bean
    @GetMapping("{id}")
    public ResponseEntity<Group> findById(@PathVariable Long id){
        Group group = groupService.findById(id);
        return ResponseEntity.ok(group);
    }
}
