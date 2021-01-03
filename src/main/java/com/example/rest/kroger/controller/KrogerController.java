package com.example.rest.kroger.controller;

import com.example.rest.kroger.client.KrogerClient;
import com.example.rest.kroger.dto.Result;
import lombok.AllArgsConstructor;
import net.minidev.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class KrogerController {

    private final KrogerClient krogerClient;

    @GetMapping("/products/{product}")
    public Result getProducts(@PathVariable("product") String product) {
        return krogerClient.getKrogerProducts(product, Result.class);
    }

    @GetMapping("/jprod/{product}")
    public JSONObject getJsonProducts(@PathVariable("product") String product) {
        return krogerClient.getKrogerProducts(product, JSONObject.class);
    }
}
