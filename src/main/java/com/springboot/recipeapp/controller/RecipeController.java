package com.springboot.recipeapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.recipeapp.domain.Recipe;
import com.springboot.recipeapp.service.RecipeServiceImpl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequiredArgsConstructor
@Slf4j
public class RecipeController {
	
	private final RecipeServiceImpl recipeService;
	
	@RequestMapping({"/recipe/show/{id}"})
	public String show(@PathVariable String id ,Model model ) {
		
		log.info("RecipeController called..");
		Recipe recipe = recipeService.getRecipeById(new Long(id)).get();
		model.addAttribute("recipe",recipe);
		return "/showrecipe";
	}

}
