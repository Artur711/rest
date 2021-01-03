package com.example.rest.kroger.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class Image {

    @JsonSetter("perspective")
    private String perspective;

    @JsonSetter("sizes")
    private List<Size> sizes;

    @Getter
    @Setter
    private static class Size {

        @JsonSetter("size")
        private String size;

        @JsonSetter("url")
        private String url;
    }
}
