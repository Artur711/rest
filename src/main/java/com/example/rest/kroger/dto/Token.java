package com.example.rest.kroger.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class Token {

    @JsonSetter("access_token")
    private String token;

    public boolean isEmpty() {
        return token == null;
    }
}
