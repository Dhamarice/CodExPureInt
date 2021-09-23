package com.example.codex.service;


import com.example.codex.model.Breed;
import com.example.codex.repository.BreedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BreedServiceImpl implements BreedService{

    @Autowired
    BreedRepository breedRepository;

    public List<Breed> getBreeds(){
        return breedRepository.findAll();
    }

    public Breed saveBreed(Breed breed){

        return breedRepository.save(breed);
    }
}
