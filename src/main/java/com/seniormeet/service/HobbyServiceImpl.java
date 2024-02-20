package com.seniormeet.service;

import com.seniormeet.model.Hobby;
import com.seniormeet.repository.HobbyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HobbyServiceImpl implements HobbyService {

    private HobbyRepository hobbyRepository;

    public HobbyServiceImpl(HobbyRepository hobbyRepository) {
        this.hobbyRepository = hobbyRepository;
    }

    @Override
    public List<Hobby> findAll() {
        List<Hobby> hobbies = hobbyRepository.findAll();
        return hobbies;
    }

    @Override
    public Hobby findById(Long Id) {
        return null;
    }


}
