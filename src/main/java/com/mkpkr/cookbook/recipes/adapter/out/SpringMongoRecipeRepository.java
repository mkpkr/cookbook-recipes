package com.mkpkr.cookbook.recipes.adapter.out;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mkpkr.cookbook.recipes.domain.Recipe;

public interface SpringMongoRecipeRepository extends MongoRepository<Recipe, UUID> {

}
