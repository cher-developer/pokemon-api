package com.bankaya.pokemon.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;

import java.util.Collections;

@SpringBootApplication
public class PokemonApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(PokemonApiApplication.class, args);
    }

    @Bean
    public ApiInfo getApiInfo() {
        return new ApiInfo(
                "Service Pokemon Api",
                "Order Service API For Consumer Pokemon API",
                "1.0",
                "http://swagger.io/terms/",
                new Contact("Codmind", "https://example.com", "juliocazul@hotmail.com"),
                "By Bankaya",
                "LICENSE URL",
                Collections.emptyList()
        );
    }
}
