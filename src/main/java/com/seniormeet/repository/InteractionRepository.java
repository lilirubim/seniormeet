package com.seniormeet.repository;

import com.seniormeet.model.Interaction;
import com.seniormeet.model.InteractionType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface InteractionRepository extends JpaRepository<Interaction, Long> {
    Interaction findByPost_IdAndUser_IdAndType(Long postId, Long userId, InteractionType type);

    List<Interaction> findByUser_IdAndType(Long userId, InteractionType type);
}