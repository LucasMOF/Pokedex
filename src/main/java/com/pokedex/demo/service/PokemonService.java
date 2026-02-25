package com.pokedex.demo.service;

import com.pokedex.demo.model.Pokemon;
import com.pokedex.demo.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PokemonService {

    @Autowired
    private PokemonRepository repository;

    public Pokemon salvarPokemon(Pokemon novoPokemon) {
        return repository.save(novoPokemon);
    }

    public List<Pokemon> listarPokemons() {
        return repository.findAll();
    }

    public Pokemon atualizarPokemon(Long numero, Pokemon atualizar) {
        Pokemon pokemon = repository.findById(numero)
                .orElseThrow(() -> new RuntimeException("Pokemon não encontrado!"));

        pokemon.setNome(atualizar.getNome());
        pokemon.setLevel(atualizar.getLevel());
        pokemon.setTipo(atualizar.getTipo());

        return repository.save(pokemon);
    }

    public void deletarPokemon(Long numero){
        repository.deleteById(numero);
    }
}
