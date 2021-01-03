package com.example.rest.spoonacular.service;

import org.springframework.stereotype.Service;

@Service
public class ApiUrlService {

    public String getRecipes(String ingredient) {
        return String.format("https://api.spoonacular.com/recipes/complexSearch?%s&includeIngredients=%s.", "%s", ingredient);
    }

    public String getRecipesVegetarian() {
        return "https://api.spoonacular.com/recipes/complexSearch?%s&diet=vegetarian";
    }

    public String getRecipeDetails(String id) {
        return String.format("https://api.spoonacular.com/recipes/%s/information?%s&includeNutrition=true.", id, "%s");
    }
}
