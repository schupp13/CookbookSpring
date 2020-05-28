package com.cookbook.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.cookbook.model.*;
public interface RecipeDaoContract extends JpaRepository<Recipe, Integer> {

}
