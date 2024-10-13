package com.bankaya.pokemon.api.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Held {

    private HeldItem item;
    private List<VersionDetail> version_details;

}
