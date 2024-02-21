package com.seniormeet.service;

import com.seniormeet.model.Interaction;
import com.seniormeet.repository.InteractionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
public class InteractionServiceImpl implements InteractionService{

    private InteractionRepository interactionRepository;

    public InteractionServiceImpl(InteractionRepository interactionRepository) { this.interactionRepository = interactionRepository; }

    @Override
    public List<Interaction> findInteractions() {
        return interactionRepository.findAll();
    }

    @Override
    public Interaction findById(Long id) {return interactionRepository.findById(id).orElse(null); }
}
