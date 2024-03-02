package com.seniormeet.controller;

import com.seniormeet.model.Hobby;
import com.seniormeet.service.HobbyService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@AllArgsConstructor
@RestController
@RequestMapping("/hobbies")

public class HobbyController {

    private HobbyService hobbyService;

    // public HobbyController(HobbyService hobbyService) {
   //      this.hobbyService = hobbyService;
   // }

    @GetMapping
    public ResponseEntity<List<Hobby>> findAll() {
        List<Hobby> hobbies = hobbyService.findAll();
        return ResponseEntity.ok(hobbies);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Hobby> findById(@PathVariable Long id) {
        Hobby hobby = hobbyService.findById(id);
        return ResponseEntity.ok(hobby);
    }

    @PostMapping()
    public ResponseEntity<Hobby> create(@RequestBody Hobby hobby) {
        return  ResponseEntity.ok (hobbyService.save(hobby));
    }

   @PutMapping("/{id}")
    public ResponseEntity<Hobby> updateHobby(@PathVariable Long id, @RequestBody Hobby hobby) {
        Hobby updateHobby = hobbyService.updateHobby(id, hobby);
        if (updateHobby != null) {
            return ResponseEntity.ok(updateHobby);
        } else {
            return ResponseEntity.notFound().build();
        }
   }

   @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteHobby(@PathVariable Long id) {
        boolean deleted = hobbyService.deleteHobby(id);
        if (deleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
   }
}
