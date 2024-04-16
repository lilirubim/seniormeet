package com.seniormeet.service;

import com.seniormeet.model.Hobby;
import com.seniormeet.repository.HobbyRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class HobbyServiceImpl implements HobbyService {

    private HobbyRepository hobbyRepository;

    public HobbyServiceImpl(HobbyRepository hobbyRepository) {
        this.hobbyRepository = hobbyRepository;
    }

    @Override
    public List<Hobby> findAll() {
        return hobbyRepository.findAll();
    }

    @Override
    public Hobby findById(Long id) {

        return hobbyRepository.findById(id).orElse(null);
    }

    @Override
    public Hobby updateHobby(Long id, Hobby hobby) {
        Optional<Hobby> hobbyOptional = hobbyRepository.findById(id);
        if (hobbyOptional.isPresent()) {
            Hobby existingHobby = hobbyOptional.get();
            existingHobby.setName(hobby.getName());
            existingHobby.setDescription(hobby.getDescription());
            return hobbyRepository.save(existingHobby);
        }
        return null;
    }

    @Override
    public Hobby save(Hobby hobby) {
        return hobbyRepository.save(hobby);
    }

    @Override
    public boolean deleteHobby(Long id) {
            Optional<Hobby> hobbyOptional = hobbyRepository.findById(id);
            if (hobbyOptional.isPresent()) {
                hobbyRepository.deleteById(id);
                return true;
            }
            return false;

        }

}