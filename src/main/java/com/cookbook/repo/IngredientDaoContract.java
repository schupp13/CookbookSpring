package com.cookbook.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cookbook.model.Ingredient;


public interface IngredientDaoContract extends JpaRepository<Ingredient, Integer> {

}
