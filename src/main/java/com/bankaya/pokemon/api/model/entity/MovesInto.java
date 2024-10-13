package com.bankaya.pokemon.api.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class MovesInto {
    private String name;
    private String url;

    public static class VersionGroupDetails implements Serializable {
        private Integer level_learned_at;

    }
}
