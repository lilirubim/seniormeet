package com.seniormeet.repository;

import com.seniormeet.model.Suggestions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SuggestionsRepository extends JpaRepository<Suggestions, Long> {
}