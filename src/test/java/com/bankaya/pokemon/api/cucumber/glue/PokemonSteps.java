package com.bankaya.pokemon.api.cucumber.glue;

import com.bankaya.pokemon.api.cucumber.CucumberConfiguration;

import com.bankaya.pokemon.api.model.entity.Ability;
import com.bankaya.pokemon.api.model.entity.Held;
import com.bankaya.pokemon.api.service.PokemonService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@CucumberContextConfiguration
public class PokemonSteps extends CucumberConfiguration {
    private static String POKEMON_NAME = "ivysaur";

    @Autowired
    private PokemonService pokemonService;
    // ^pomeon by name$
    @Given("pokemon abilities by name")
    public void pokemon_abilities_by_name() {
        List<Ability> list = this.pokemonService.findPokemonAbilityByName(POKEMON_NAME);
        list.stream().forEach(System.out::println);
    }

    @When("id from pokemon by name")
    public void id_from_pokemon_by_name() {
        Integer id =this.pokemonService.findPokemonIdByName(POKEMON_NAME);
        System.out.println("id: " + id);
    }

    @When("get base experience from pokemon by name")
    public void get_base_experience_from_pokemon_by_name() {
        Integer base_experience = this.pokemonService.findPokemonBaseExperience(POKEMON_NAME);
        System.out.println("base_experience: " + base_experience);
    }

    @And("return the name of pokmeon by name")
    public void return_the_name_of_pokemon_by_name() {
        String pokemonName = this.pokemonService.findPokemonNameByName(POKEMON_NAME);
        System.out.println("pokemonName: "+pokemonName);
    }

    @When("the location area encounters from pokemon by name")
    public void the_location_area_encounters_from_pokemon_by_name() {
        String location_area = this.pokemonService.findPokemonLocationAreaEncounters(POKEMON_NAME);
        System.out.println("location_area: "+location_area);
    }

    @Then("search held item from pokemon by name")
    public void search_held_item_from_pokemon_by_name() {
        List<Held> lis = this.pokemonService.findPokemonHeldItemByName(POKEMON_NAME);
    }

}
