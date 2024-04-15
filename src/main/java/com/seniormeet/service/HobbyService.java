package com.seniormeet.service;

import com.seniormeet.model.Hobby;

import java.util.List;
import java.util.Set;

public interface HobbyService {
    public Set<Hobby> findAll();
    public Hobby findById(Long Id);


    Hobby updateHobby(Long id, Hobby hobby);

    Hobby save(Hobby hobby);

    boolean deleteHobby(Long id);

}
