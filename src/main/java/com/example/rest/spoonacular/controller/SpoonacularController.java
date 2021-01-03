package com.example.rest.spoonacular.controller;

import com.example.rest.spoonacular.client.SpoonacularClient;
import com.example.rest.spoonacular.dto.RecipeDetails;
import com.example.rest.spoonacular.dto.Recipes;
import com.example.rest.spoonacular.service.ApiUrlService;
import lombok.AllArgsConstructor;
import net.minidev.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class SpoonacularController {


    private final SpoonacularClient spoonacularClient;
    private final ApiUrlService apiUrlService;

    @GetMapping("/json")
    public JSONObject getJson() {
            return spoonacularClient.getJson(JSONObject.class, apiUrlService.getRecipesVegetarian());
    }

    @GetMapping("/recipe-details/{id}")
    public RecipeDetails getRecipe(@PathVariable("id") String id) {
        return spoonacularClient.getJson(RecipeDetails.class, apiUrlService.getRecipeDetails(id));
    }

    @GetMapping("/recipes/{ingredient}")
    public Recipes getRecipes(@PathVariable("ingredient") String ingredient) {
        return spoonacularClient.getJson(Recipes.class, apiUrlService.getRecipes(ingredient));
    }
}
