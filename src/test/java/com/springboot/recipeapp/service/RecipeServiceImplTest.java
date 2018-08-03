package com.springboot.recipeapp.service;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RecipeServiceImplTest {

	@Autowired
	private RecipeServiceImpl recipeService;
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetRecipes() {
		
		assertEquals(2,recipeService.getRecipes().size());
	}

}
