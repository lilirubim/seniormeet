package com.seniormeet.controller;

import com.seniormeet.model.Interaction;
import com.seniormeet.repository.InteractionRepository;
import com.seniormeet.service.InteractionService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
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

    private InteractionRepository repo;
    @PostMapping("create-interaction")
    public ResponseEntity<Interaction> create(@RequestBody Interaction interaction) {

        return ResponseEntity.ok(repo.save(interaction));
    }
    @PutMapping("interaction/{id}")
    public Interaction update(@RequestBody Interaction interaction, @PathVariable Long id){
        return repo.save(interaction);
    }
    @DeleteMapping("interaction/{id}")
    public void delete(@PathVariable Long id){
        repo.deleteById(id);
    }




}
