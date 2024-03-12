package com.seniormeet.service;

import com.seniormeet.model.Interaction;
import com.seniormeet.repository.InteractionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public Interaction save(Interaction interaction) {
        return interactionRepository.save(interaction);
    }

    @Override
    public void deleteById(Long id) {
        interactionRepository.deleteById(id);

    }

    @Override
    public Interaction save(Long id, Interaction interaction) {
        Optional<Interaction> interactionOptional = interactionRepository.findById(id);
        if (interactionOptional.isPresent()) {
            Interaction existingInteraction = interactionOptional.get();
            existingInteraction.setType(interaction.getType());
            existingInteraction.setDate(interaction.getDate());


            // Actualizar otras propiedades según sea necesario
            return interactionRepository.save(existingInteraction);
        } else {
            return null;
        }

    }

    @Override
    public boolean deleteInteraction(Long id) {
        Optional<Interaction> interactionOptional = interactionRepository.findById(id);
        if (interactionOptional.isPresent()) {
            interactionRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}
