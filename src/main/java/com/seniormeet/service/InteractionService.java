package com.seniormeet.service;

import com.seniormeet.model.Interaction;
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
}
