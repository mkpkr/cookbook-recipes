package com.mkpkr.cookbook.recipes.adapter.in;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mkpkr.cookbook.recipes.domain.Recipe;

@RestController
@RequestMapping("/recipes")
public class RecipeController {
	
	@GetMapping("/{recipeId}")
	public Recipe getRecipe(@PathVariable("recipeId") String recipeId) {
		return new Recipe();
	}

}
