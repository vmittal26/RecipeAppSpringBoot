package com.springboot.recipeapp.domain;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="Ingredient")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of ="id")
public class Ingredient {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	private String description;
	private BigDecimal amount;

    public Ingredient(String description, BigDecimal amount, UnitOfMeasure unitOfMeasure, Recipe recipe) {
	        this.description = description;
	        this.amount = amount;
	        this.unitOfMeasure = unitOfMeasure;
	        this.recipe = recipe;
	}
	@ManyToOne
	private Recipe recipe;
	
	@OneToOne
	private UnitOfMeasure unitOfMeasure;
	
	
}
