package com.springboot.recipeapp.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="Recipe")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of ="id")
public class Recipe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String description;
	private int prepTime;
	private int cookTime;
	private int servings;
	private String source;
	private String direction;
	private DifficultyEnum difficulty;
	private String url;
	  
	@Lob
	private String directions;
	
	@Lob
	private Byte[] image;
	@OneToOne(mappedBy = "recipe" ,cascade = CascadeType.ALL)
	private Notes notes;
	
	@OneToMany(mappedBy = "recipe",cascade = CascadeType.ALL)
	private Set<Ingredient> ingredients = new HashSet<>();;
	
	@ManyToMany
	@JoinTable(name="RECIPE_CATEGORY",
	joinColumns=@JoinColumn(name="RECIPE_ID"),
    inverseJoinColumns=@JoinColumn(name="CATEGORY_ID"))
	private Set<Category> categories = new HashSet<>();

	public void addIngredient(Ingredient ingredient) {
		ingredients.add(ingredient);
	}
	
	public void setNotes(Notes notes) {
		this.notes = notes;
		notes.setRecipe(this);
	}
}
