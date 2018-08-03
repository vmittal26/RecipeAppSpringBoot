package com.springboot.recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.springboot.recipeapp.domain.Recipe;

public interface RecipeCrudRepository extends CrudRepository<Recipe, Long> {

}
