package com.cookbook.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.cookbook.model.*;
public interface LikedRecipeDaoContract extends JpaRepository<LikedRecipe, Integer> {

}
