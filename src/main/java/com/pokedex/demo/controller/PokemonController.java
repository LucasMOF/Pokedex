package com.pokedex.demo.controller;

import com.pokedex.demo.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PokemonController {

    @Autowired
    private PokemonService service;

    
}
