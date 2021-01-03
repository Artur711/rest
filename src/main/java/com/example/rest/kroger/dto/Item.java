package com.example.rest.kroger.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class Item {

    @JsonSetter("nationalPrice")
    private Price price;

    @JsonSetter("size")
    private String size;

    @Getter
    @Setter
    private static class Price {

        @JsonSetter("regular")
        private Double regularPrice;

        @JsonSetter("promo")
        private  Double promoPrice;
    }
}
