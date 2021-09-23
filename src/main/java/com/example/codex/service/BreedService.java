package com.example.codex.service;

import com.example.codex.model.Breed;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BreedService {

    List<Breed> getBreeds();

    Breed saveBreed(Breed breed);
}
