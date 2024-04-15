package com.seniormeet.controller;
import com.seniormeet.model.Suggestions;
import com.seniormeet.service.SuggestionsService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@AllArgsConstructor
@RestController
@CrossOrigin("*")
@Slf4j
@RequestMapping("/suggestions")

public class SuggestionsController {

    private SuggestionsService suggestionsService;

    // public SuggestionsController(SuggestionsService suggestionsService) {
    //      this.suggestionsService = suggestionsService;
    // }

    @GetMapping
    public ResponseEntity<List<Suggestions>> findAll() {
        List<Suggestions> suggestions = suggestionsService.findAll();
        return ResponseEntity.ok(suggestions);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Suggestions> findById(@PathVariable Long id) {
        Suggestions suggestions = suggestionsService.findById(id);
        return ResponseEntity.ok(suggestions);
    }

    @PostMapping()
    public ResponseEntity<Suggestions> create(@RequestBody Suggestions suggestions) {
        return  ResponseEntity.ok (suggestionsService.save(suggestions));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Suggestions> updateSuggestions(@PathVariable Long id, @RequestBody Suggestions suggestions) {
        Suggestions updateSuggestions = suggestionsService.updateSuggestions(id, suggestions);
        if (updateSuggestions != null) {
            return ResponseEntity.ok(updateSuggestions);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSuggestions(@PathVariable Long id) {
        boolean deleted = suggestionsService.deleteSuggestions(id);
        if (deleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
