package com.seniormeet.controller;

import com.seniormeet.model.Interaction;
import com.seniormeet.model.InteractionType;
import com.seniormeet.service.InteractionService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@AllArgsConstructor
@Slf4j
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

    @GetMapping("/user-likes/{userId}")
    public ResponseEntity<List<Interaction>> findUserLikes(@PathVariable Long userId){
        List<Interaction> likes = interactionService.findByUser_IdAndType(userId, InteractionType.LIKE);
        return ResponseEntity.ok(likes);
    }

    @GetMapping("/user-likes/{userId}")
    public ResponseEntity<List<Interaction>> findUserSaves(@PathVariable Long userId){
        List<Interaction> saves = interactionService.findByUser_IdAndType(userId, InteractionType.SAVE);
        return ResponseEntity.ok(saves);
    }


    @PostMapping("/create")
    public ResponseEntity<Interaction> create(@RequestBody Interaction interaction) {

        return ResponseEntity.ok(interactionService.save(interaction));
    }
    @PutMapping("/{id}")
    public Interaction update(@RequestBody Interaction interaction, @PathVariable Long id){
        return interactionService.save(id, interaction);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteInteraction(@PathVariable Long id) {
        boolean deleted = interactionService.deleteInteraction(id);
        if (deleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }



}
