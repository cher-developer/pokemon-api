package com.bankaya.pokemon.api;

import com.bankaya.pokemon.api.endpoint.UrlEndPoint;
import com.bankaya.pokemon.api.model.entity.Held;
import com.bankaya.pokemon.api.service.PokemonService;
import jakarta.inject.Inject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;

import java.util.List;


@Slf4j
@SpringBootTest
class PokemonApiApplicationTests {

    @Inject
    private PokemonService pokemonService;

    private static String POKEMON_NAME = "ivysaur";

    @Test
    public void contextLoads() {
    }

    @Test
    public void testPokemonAbility() {
        String ability = pokemonService.findPokemonAbilityByName(POKEMON_NAME).stream().findFirst().get().getAbility().getName();
        assertEquals("overgrow", ability);
    }

    @Test
    public void testPokemonBaseExperience() {
        Integer baseExperience = this.pokemonService.findPokemonBaseExperience(POKEMON_NAME);
        log.info("baseExperience: {}", baseExperience);
    }

    @Test
    public void testPokemonId() {
        Integer id = this.pokemonService.findPokemonIdByName(POKEMON_NAME);
        log.info("id: {}", id);
    }

    @Test
    public void testPokemonName() {
        String name = this.pokemonService.findPokemonNameByName(POKEMON_NAME);
        assertEquals(POKEMON_NAME, name);
    }

    @Test
    public void testPokemonLocationAreaEncounters() {
        String location_area_encounters = this.pokemonService.findPokemonLocationAreaEncounters(POKEMON_NAME);
        log.info("location_area_encounters: {}", location_area_encounters);
    }

    @Test
    public void testPokemonHeldItem() {
        List<Held> held_item = this.pokemonService.findPokemonHeldItemByName(POKEMON_NAME);
        assertNotNull(held_item);
    }
}
