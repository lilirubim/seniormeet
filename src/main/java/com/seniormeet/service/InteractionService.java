package com.seniormeet.service;

import com.seniormeet.model.Interaction;
import com.seniormeet.model.InteractionType;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface InteractionService {

    // Interfaz
    List<Interaction> findInteractions();
    Interaction findById(Long id);


    Interaction save(Interaction interaction);

    void deleteById(Long id);

    Interaction save(Long id, Interaction interaction);

    boolean deleteInteraction(Long id);

    Interaction findByPost_IdAndUser_IdAndType(Long postId, Long userId, InteractionType type);

    List<Interaction> findByUser_IdAndType(Long userId, InteractionType type);

}
