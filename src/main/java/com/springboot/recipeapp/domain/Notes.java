package com.springboot.recipeapp.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity(name="Notes")
@Data
public class Notes {

	@Id
	private Long id;
	@OneToOne
	private Recipe recipe;
	@Lob
	private String recipeNote;
}
