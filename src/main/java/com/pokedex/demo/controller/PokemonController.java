package com.pokedex.demo.controller;

import com.pokedex.demo.model.Pokemon;
import com.pokedex.demo.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PokemonController {

    @Autowired
    private PokemonService service;

    @PostMapping("/pokemon")
    public Pokemon salvarPokemon(@RequestBody Pokemon novoPokemon) {
        return service.salvarPokemon(novoPokemon);
    }

    @GetMapping("/pokemon")
    public List<Pokemon> listarPokemons() {
        return service.listarPokemons();
    }

    @PutMapping("/pokemon/{numero}")
    public Pokemon atualizarPokemon(@PathVariable Long numero, @RequestBody Pokemon atualizarPokemon) {
        return service.atualizarPokemon(numero, atualizarPokemon);
    }

    @DeleteMapping("/pokemon/{numero}")
    public String deletarPokemon(@PathVariable Long numero) {
        service.deletarPokemon(numero);
        return "O pokemon número: " + numero;
    }
}
