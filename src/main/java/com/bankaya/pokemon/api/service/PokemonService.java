package com.bankaya.pokemon.api.service;

import com.bankaya.pokemon.api.model.entity.Ability;
import com.bankaya.pokemon.api.model.entity.Held;
import com.bankaya.pokemon.api.model.entity.HeldItem;

import java.util.List;

public interface PokemonService {

    List<Ability> findPokemonAbilityByName(String pokemonName);

    Integer findPokemonBaseExperience(String pokemonName);

    List<Held> findPokemonHeldItemByName(String pokemonName);

    Integer findPokemonIdByName(String pokemonName);

    String findPokemonNameByName(String pokemonName);

    String findPokemonLocationAreaEncounters(String pokemonName);
}
