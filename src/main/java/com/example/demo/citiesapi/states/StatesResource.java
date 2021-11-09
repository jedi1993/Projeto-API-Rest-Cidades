package com.example.demo.citiesapi.states;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/states")
public class StatesResource {
    private final StateRepository repository;

    public StatesResource(final StateRepository repository){
        this.repository = repository;
    }
    @GetMapping
    public List<State> staties(){
        return repository.findAll();
    }
}
