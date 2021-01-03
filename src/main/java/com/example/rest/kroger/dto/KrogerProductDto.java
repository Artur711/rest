package com.example.rest.kroger.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class KrogerProductDto {

    @JsonSetter("productId")
    private String strProductId;

    @JsonSetter("description")
    private String description;

    @JsonSetter("images")
    private List<Image> imageList;

    @JsonSetter("items")
    private List<Item> items;
}
