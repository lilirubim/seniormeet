package com.seniormeet.service;

import com.seniormeet.model.Suggestions;
import com.seniormeet.repository.SuggestionsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SuggestionsServiceImpl implements SuggestionsService {

    private SuggestionsRepository suggestionsRepository;

    public SuggestionsServiceImpl(SuggestionsRepository suggestionsRepository) {
        this.suggestionsRepository = suggestionsRepository;
    }

    @Override
    public List<Suggestions> findAll() {
        List<Suggestions> suggestions = suggestionsRepository.findAll();
        return suggestions;
    }

    @Override
    public Suggestions findById(Long id) {

        return suggestionsRepository.findById(id).orElse(null);
    }

    @Override
    public Suggestions updateSuggestions(Long id, Suggestions suggestions) {
        Optional<Suggestions> suggestionsOptional = suggestionsRepository.findById(id);
        if (suggestionsOptional.isPresent()) {
            Suggestions existingSuggestions = suggestionsOptional.get();
            existingSuggestions.setName(suggestions.getName());
            existingSuggestions.setDescription(suggestions.getDescription());
            return suggestionsRepository.save(existingSuggestions);
        } else {
            return null;}
    }

    @Override
    public Suggestions save(Suggestions suggestions) {
        return suggestionsRepository.save(suggestions);
    }

    @Override
    public boolean deleteSuggestions(Long id) {
        Optional<Suggestions> suggestionsOptional = suggestionsRepository.findById(id);
        if (suggestionsOptional.isPresent()) {
            suggestionsRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

}