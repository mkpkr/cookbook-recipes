package com.mkpkr.cookbook.recipes.adapter.in;

import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recipes")
public class RecipeController {
	
	@GetMapping
	public String getRecipe(UUID recipeId) {
		return "this is a recipe";
	}

}
