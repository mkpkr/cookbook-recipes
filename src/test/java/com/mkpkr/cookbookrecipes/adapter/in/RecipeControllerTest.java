package com.mkpkr.cookbookrecipes.adapter.in;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.mkpkr.cookbook.recipes.adapter.in.RecipeController;
import com.mkpkr.cookbook.recipes.domain.Recipe;

@ExtendWith(MockitoExtension.class)
public class RecipeControllerTest {
	
	private static String recipeId = "ABC";
	
	MockMvc mockMvc;
	
	@InjectMocks
	RecipeController controller;
	
	@BeforeEach
	public void setUp() {
		mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
	}
	
	@Test
	public void getRecipe() throws Exception {
		mockMvc.perform(get("/recipes/" + recipeId))
			   .andExpect(status().isOk())
			   .andExpect(content().json("{\\\"id\\\":null}"));
	}

}
