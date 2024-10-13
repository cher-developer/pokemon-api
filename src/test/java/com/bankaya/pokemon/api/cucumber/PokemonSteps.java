package com.bankaya.pokemon.api.cucumber;



import com.bankaya.pokemon.api.model.entity.Ability;
import com.bankaya.pokemon.api.service.PokemonService;
import io.cucumber.java.en.Given;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@CucumberContextConfiguration
public class PokemonSteps extends CucumberSpringConfiguration {


    @Autowired
    private PokemonService pokemonService;

    private static final String POKEMON_NAME = "ivysaur";

    @Given("Give List of abilities by name ")
    public void give_list_of_abilities_by_name() {
        List<Ability> list = this.pokemonService.findPokemonAbilityByName(POKEMON_NAME);
        list.stream().forEach(System.out::println);
    }

   /* @When("client calls greeting endpoint")
    public void clientCallsToGreetingEndpoint() {
        response = testRestTemplate.getForEntity("/greeting/" + username, String.class);
    }

    @Then("client receives hello text and username")
    public void clientReceivesHelloTextAndGreeting() {
        Assertions.assertEquals("hello " + username, response.getBody());
    }*/
}
