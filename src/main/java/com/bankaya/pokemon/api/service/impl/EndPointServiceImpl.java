package com.bankaya.pokemon.api.service.impl;

import com.bankaya.pokemon.api.endpoint.UrlResponse;
import com.bankaya.pokemon.api.service.EndPointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Service
public class EndPointServiceImpl implements EndPointService {

    @Value("${pokemon.url}")
    private String url;

    @Autowired
    private RestTemplate restTemplate;


    @Override
    public String getUrl(String pokemonName) {
        UrlResponse response = restTemplate.getForObject(url , UrlResponse.class);
        return Arrays.stream(response.getResults()).filter(ul -> ul.getName().equals(pokemonName)).map(url -> url.getUrl()).findFirst().get();

    }



}
