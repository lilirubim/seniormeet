package com.seniormeet.service;

import com.seniormeet.model.Hobby;

import java.util.List;

public interface HobbyService {
    public List<Hobby> findAll();
    public Hobby findById(Long Id);


}
