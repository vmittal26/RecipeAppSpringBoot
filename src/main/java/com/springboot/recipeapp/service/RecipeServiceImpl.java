package com.springboot.recipeapp.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.springboot.recipeapp.domain.Recipe;
import com.springboot.recipeapp.repositories.RecipeCrudRepository;

@Service
public class RecipeServiceImpl {

	private final RecipeCrudRepository recipeCrudRepository;

	public RecipeServiceImpl(RecipeCrudRepository recipeCrudRepository) {
		this.recipeCrudRepository = recipeCrudRepository;
	}
	
	public Set<Recipe> getRecipes(){
		Set<Recipe> recipeSet = new HashSet<>();
		recipeCrudRepository.findAll().iterator().forEachRemaining(recipeSet::add);
		return recipeSet;
	}
	
}
