package com.springboot.recipeapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.recipeapp.service.RecipeServiceImpl;

@Controller
public class IndexController {
	
	private RecipeServiceImpl recipeService;

	public IndexController(RecipeServiceImpl recipeService) {
		this.recipeService = recipeService;
	}
	
	@RequestMapping({"","/","/recipes"})
	public String getIndexPage(Model model) {
		
		model.addAttribute("recipes",recipeService.getRecipes());
		return "index";
	}
	

}
