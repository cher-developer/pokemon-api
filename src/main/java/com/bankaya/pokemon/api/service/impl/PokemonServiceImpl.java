package com.bankaya.pokemon.api.service.impl;

import com.bankaya.pokemon.api.model.entity.Ability;
import com.bankaya.pokemon.api.model.entity.Held;
import com.bankaya.pokemon.api.model.entity.HeldItem;
import com.bankaya.pokemon.api.model.entity.Pokemon;
import com.bankaya.pokemon.api.service.EndPointService;
import com.bankaya.pokemon.api.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import java.util.List;

@Service
public class PokemonServiceImpl implements PokemonService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private EndPointService endPointService;

    @Override
    public List<Ability> findPokemonAbilityByName(String pokemonName) {
        String urlPokemon = endPointService.getUrl(pokemonName);
        Pokemon pokemon = restTemplate.getForObject(urlPokemon, Pokemon.class);
        return pokemon.getAbilities();
    }

    @Override
    public Integer findPokemonBaseExperience(String pokemonName) {
        String urlPokemon = endPointService.getUrl(pokemonName);
        Pokemon pokemon = restTemplate.getForObject(urlPokemon, Pokemon.class);
        return pokemon.getBase_experience();
    }

    @Override
    public List<Held> findPokemonHeldItemByName(String pokemonName) {
        String urlPokemon = endPointService.getUrl(pokemonName);
        Pokemon pokemon = restTemplate.getForObject(urlPokemon, Pokemon.class);
        return pokemon.getHeld_items();
    }

    @Override
    public Integer findPokemonIdByName(String pokemonName) {
        String urlPokemon = endPointService.getUrl(pokemonName);
        Pokemon pokemon = restTemplate.getForObject(urlPokemon, Pokemon.class);
        return pokemon.getId();
    }

    @Override
    public String findPokemonNameByName(String pokemonName) {
        String urlPokemon = endPointService.getUrl(pokemonName);
        Pokemon pokemon = restTemplate.getForObject(urlPokemon, Pokemon.class);
        return pokemon.getName();
    }

    @Override
    public String findPokemonLocationAreaEncounters(String pokemonName) {
        String urlPokemon = endPointService.getUrl(pokemonName);
        Pokemon pokemon = restTemplate.getForObject(urlPokemon, Pokemon.class);
        return pokemon.getLocation_area_encounters();
    }
}
