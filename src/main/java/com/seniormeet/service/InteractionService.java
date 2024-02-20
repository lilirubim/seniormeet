package com.seniormeet.service;

import com.seniormeet.model.Interaction;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface InteractionService {

    // Interfaz
    List<Interaction> findInteractions();
    Interaction findById(Long id);


}
