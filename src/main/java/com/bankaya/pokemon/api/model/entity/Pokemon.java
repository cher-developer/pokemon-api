package com.bankaya.pokemon.api.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Pokemon {
    private Integer id;
    private String name;
    private String location_area_encounters;
    private Integer base_experience;
    private List<Ability> abilities;
    private List<Held> held_items;
    private List<Moves> moves;

}
