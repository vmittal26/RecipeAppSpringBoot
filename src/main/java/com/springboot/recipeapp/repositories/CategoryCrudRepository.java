package com.springboot.recipeapp.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.springboot.recipeapp.domain.Category;

public interface CategoryCrudRepository extends CrudRepository<Category, Long> {

	public Optional<Category> findByDescription(String desciption);
	
}
