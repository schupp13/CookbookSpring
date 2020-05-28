package com.cookbook.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cookbook.model.RateRecipe;

public interface RateRecipeDaoContract extends JpaRepository<RateRecipe, Integer> {

}
