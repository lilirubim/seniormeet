package com.seniormeet.controller;

import com.seniormeet.model.Group;
import com.seniormeet.repository.GroupRepository;
import com.seniormeet.service.GroupService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/groups")
public class GroupController {

    private GroupService groupService;

//    public GroupController(GroupService groupService) {
//        this.groupService = groupService;
//    }

    @GetMapping
    public ResponseEntity<List<Group>> findAll() {
        List<Group> groups = groupService.findGroup();
        return ResponseEntity.ok(groups);
    }

    @GetMapping("{id}")
    public ResponseEntity<Group> findById(@PathVariable Long id){
        Group group = groupService.findById(id);
        return ResponseEntity.ok(group);
    }

    private GroupRepository repo;
    //@PostMapping("groups")
    //public ResponseEntity<Group> create(@RequestBody Group group) {
    //    return ResponseEntity.ok(repo.save(group));
    //}

    @PostMapping("/groups")
    public ResponseEntity<Group> create(@RequestBody Group group) {

        try {
            return ResponseEntity.ok(repo.save(group));
        } catch (Exception e) {// capturar errores derivados de guardar en db
            return ResponseEntity.status(409).build(); // No se puede guardar por conflicto con otros usuarios/address
        }
    }

    @PutMapping("groups/{id}")
    public Group update(@RequestBody Group group, @PathVariable Long id){
        return repo.save(group);
    }

    @DeleteMapping("groups/{id}")
    public void delete(@PathVariable Long id){
        repo.deleteById(id);
    }
}
