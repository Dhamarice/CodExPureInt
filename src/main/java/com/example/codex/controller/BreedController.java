package com.example.codex.controller;

import com.example.codex.model.Breed;
import com.example.codex.service.BreedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class BreedController {

    @Autowired
    BreedService breedService;

    @GetMapping("breed")
    List<Breed> getBreedList(){
        return breedService.getBreeds();
    }

    @PostMapping("save")
    Breed saveBreed(@RequestBody Breed breed){

        return breedService.saveBreed(breed);
    }
}
