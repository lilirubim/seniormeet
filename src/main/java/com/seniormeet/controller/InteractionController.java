package com.seniormeet.controller;

import com.seniormeet.model.Interaction;
import com.seniormeet.service.InteractionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/interaction")
public class InteractionController {

    private InteractionService interactionService;

    @GetMapping
    public ResponseEntity<List<Interaction>> findAll() {
        List<Interaction> interactions = interactionService.findInteractions();
        return ResponseEntity.ok(interactions);

    }
    // Listar las interacciones
    @GetMapping("{id}")
    public ResponseEntity<Interaction> findById(@PathVariable Long id) {
        Interaction interaction = interactionService.findById(id);
        return ResponseEntity.ok(interaction);

    }


}
