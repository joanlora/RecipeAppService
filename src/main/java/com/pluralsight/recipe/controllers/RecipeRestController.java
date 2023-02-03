package com.pluralsight.recipe.controllers;

import com.pluralsight.recipe.models.Recipe;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/recipes")
public class RecipeRestController {
    @GetMapping("")
    public List<Recipe> listRecipes(){

    }

    @GetMapping("/{id}")
    public Recipe getRecipe(@PathVariable Long id){

    }

    @PostMapping("")
    public Recipe createRecipe(@RequestBody Recipe recipe){

    }

    @PutMapping("/{id}")
    public Recipe updateRecipe(@RequestBody Recipe recipe, @PathVariable Long id){ // puts the id into the db's id field

    }

    @DeleteMapping("/{id}")
    public void deleteRecipe(@PathVariable Long id){

    }

}
