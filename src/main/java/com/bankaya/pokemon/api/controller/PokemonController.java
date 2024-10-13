package com.bankaya.pokemon.api.controller;


import com.bankaya.pokemon.api.model.entity.Ability;
import com.bankaya.pokemon.api.model.entity.Held;

import com.bankaya.pokemon.api.model.entity.MessageEntity;
import com.bankaya.pokemon.api.service.MessageService;
import com.bankaya.pokemon.api.service.PokemonService;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.engine.spi.ManagedEntity;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.bankaya.pokemon.api.utils.HttpReqRespUtil.getClientIpAddressIfServletRequestExist;

@Slf4j
@RestController
public class PokemonController {


    @Autowired
    private PokemonService pokemonService;

    @Autowired
    private MessageService messageService;
    private MessageEntity message;


    @GetMapping("/pokemons/ability/{name}")
    public ResponseEntity<?> abilities(@PathVariable String name) {

        Long startTime = System.currentTimeMillis();

        String ipAddress = getClientIpAddressIfServletRequestExist();

        log.info("ip address: {}",ipAddress);
        String methodName = "abilities";
        log.info("methodName: {}",methodName);


        List<Ability> abilitys = pokemonService.findPokemonAbilityByName(name);
        if (!abilitys.isEmpty() || abilitys.size() > 0) {
            Long endTime = System.currentTimeMillis();
            messageService.saveMessage(new MessageEntity(null, ipAddress, methodName, Calendar.getInstance().getTime(), startTime, endTime));
            return ResponseEntity.ok().body(abilitys);
        }

        return ResponseEntity.notFound().build();

    }

    @GetMapping("/pokemons/base_experience/{name}")
    public ResponseEntity<?> baseExperience(@PathVariable String name) {
        Long startTime = System.currentTimeMillis();

        String ipAddress = getClientIpAddressIfServletRequestExist();

        log.info("ip address: {}",ipAddress);
        String methodName = "baseExperience";
        log.info("methodName: {}",methodName);


        Integer base_experience = this.pokemonService.findPokemonBaseExperience(name);
        Map<String, Integer> map = new HashMap<>();
        map.put("base_experience", base_experience);
        Long endTime = System.currentTimeMillis();

        messageService.saveMessage(new MessageEntity(null, ipAddress, methodName, Calendar.getInstance().getTime(), startTime, endTime));
        return ResponseEntity.ok().body(base_experience);

    }

    @GetMapping("/pokemons/id/{name}")
    public ResponseEntity<?> pokemonId(@PathVariable String name) {
        Long startTime = System.currentTimeMillis();

        String ipAddress = getClientIpAddressIfServletRequestExist();

        log.info("ip address: {}",ipAddress);
        String methodName = "pokemonId";
        log.info("methodName: {}",methodName);

        Integer id = pokemonService.findPokemonIdByName(name);
        Map<String, Integer> map = new HashMap<>();
        map.put("id", id);
        Long endTime = System.currentTimeMillis();
        messageService.saveMessage(new MessageEntity(null, ipAddress, methodName, Calendar.getInstance().getTime(), startTime, endTime));
        return ResponseEntity.ok().body(map);

    }

    @GetMapping("/pokemons/name/{name}")
    public ResponseEntity<?> pokemonName(@PathVariable String name) {
        Long startTime = System.currentTimeMillis();

        String ipAddress = getClientIpAddressIfServletRequestExist();

        log.info("ip address: {}",ipAddress);
        String methodName = "pokemonName";
        log.info("methodName: {}",methodName);
        String namePokemon = this.pokemonService.findPokemonNameByName(name);
        Map<String, String> map = new HashMap<>();
        map.put("name", namePokemon);
        Long endTime = System.currentTimeMillis();
        messageService.saveMessage(new MessageEntity(null, ipAddress, methodName, Calendar.getInstance().getTime(), startTime, endTime));
        return ResponseEntity.ok().body(map);

    }

    @GetMapping("/pokemons/location_area_encounters/{name}")
    public ResponseEntity<?> locationAreaEncounters(@PathVariable String name) {
        Long startTime = System.currentTimeMillis();

        String ipAddress = getClientIpAddressIfServletRequestExist();

        log.info("ip address: {}",ipAddress);
        String methodName = "locationAreaEncounters";
        log.info("methodName: {}",methodName);
        String location_area_encounters = this.pokemonService.findPokemonLocationAreaEncounters(name);
        Map<String, String> map = new HashMap<>();
        map.put("location_area_encounters", location_area_encounters);
        Long endTime = System.currentTimeMillis();
        messageService.saveMessage(new MessageEntity(null, ipAddress, methodName, Calendar.getInstance().getTime(), startTime, endTime));
        return ResponseEntity.ok().body(map);

    }

    @GetMapping("/pokemons/held_item/{name}")
    public ResponseEntity<?> heldItemd(@PathVariable String name) {
        Long startTime = System.currentTimeMillis();

        String ipAddress = getClientIpAddressIfServletRequestExist();

        log.info("ip address: {}",ipAddress);
        String methodName = "locationAreaEncounters";
        log.info("methodName: {}",methodName);
        List<Held> heldItem = this.pokemonService.findPokemonHeldItemByName(name);
        Long endTime = System.currentTimeMillis();
        messageService.saveMessage(new MessageEntity(null, ipAddress, methodName, Calendar.getInstance().getTime(), startTime, endTime));
        return ResponseEntity.ok().body(heldItem);

    }
}
