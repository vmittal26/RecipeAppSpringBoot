package com.springboot.recipeapp.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.springboot.recipeapp.domain.UnitOfMeasure;

public interface UnitOfMeasureCrudRepository extends CrudRepository<UnitOfMeasure, Long> {

	Optional<UnitOfMeasure> findByUnitOfMeasure(String unitOfMeasure);
}
