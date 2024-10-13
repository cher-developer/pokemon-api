package com.bankaya.pokemon.api.endpoint;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UrlResponse {
    private UrlEndPoint[] results;
}
