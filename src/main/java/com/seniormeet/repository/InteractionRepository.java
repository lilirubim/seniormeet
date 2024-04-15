package com.seniormeet.repository;

import com.seniormeet.model.Interaction;
import com.seniormeet.model.InteractionType;
import org.springframework.data.jpa.repository.JpaRepository;


public interface InteractionRepository extends JpaRepository<Interaction, Long> {
    Interaction findByPost_IdAndUser_IdAndType(Long postId, Long userId, InteractionType type);
}