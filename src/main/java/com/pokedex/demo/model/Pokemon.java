package com.pokedex.demo.model;

import com.pokedex.demo.model.enums.Tipagem;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pokemon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numero;

    private String nome;
    private int level;
    private Tipagem tipo;

    public Pokemon() {
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Tipagem getTipo() {
        return tipo;
    }

    public void setTipo(Tipagem tipo) {
        this.tipo = tipo;
    }
}
