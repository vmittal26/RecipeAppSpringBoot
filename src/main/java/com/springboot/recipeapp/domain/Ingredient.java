package com.springboot.recipeapp.domain;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity(name="Ingredient")
@Data
public class Ingredient {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	private String description;
	private BigDecimal amount;

	@ManyToOne
	private Recipe recipe;
	
	@OneToOne(mappedBy= "ingredient")
	private UnitOfMeasure unitOfMeasure;
	
	
}
