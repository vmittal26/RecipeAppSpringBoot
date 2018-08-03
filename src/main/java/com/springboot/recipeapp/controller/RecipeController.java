package com.springboot.recipeapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.recipeapp.domain.Recipe;

@Controller
public class RecipeController {
	
	@RequestMapping({"recipe/show{recipe}"})
	public String showRecipe(@PathVariable Recipe recipe ,Model model ) {
		model.addAttribute("recipe",recipe);
		
		return "/recipe/showRecipe";
	}

}
