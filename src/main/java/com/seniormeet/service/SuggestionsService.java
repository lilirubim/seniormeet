package com.seniormeet.service;

import com.seniormeet.model.Suggestions;

import java.util.List;

public interface SuggestionsService {
    List<Suggestions> findAll();

    Suggestions findById(Long id);

    Suggestions updateSuggestions(Long id, Suggestions suggestions);

    Suggestions save(Suggestions suggestions);

    boolean deleteSuggestions(Long id);
}
