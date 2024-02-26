package com.seniormeet.controller;

import com.seniormeet.model.Hobby;
import com.seniormeet.service.HobbyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HobbyController {

    private HobbyService hobbyService;

    public HobbyController(HobbyService hobbyService) {
        this.hobbyService = hobbyService;
    }
        @GetMapping("/hobby")
        public ResponseEntity<List<Hobby>> findAll() {
            List<Hobby> hobbies = hobbyService.findAll();
            return ResponseEntity.ok(hobbies);

        }

    @GetMapping("/hobby/{id}")
    public ResponseEntity<Hobby> findById(@PathVariable Long id) {
        Hobby hobby = hobbyService.findById(id);
        return ResponseEntity.ok(hobby);

    }
    }
