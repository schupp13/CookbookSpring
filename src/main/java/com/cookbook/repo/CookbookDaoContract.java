package com.cookbook.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cookbook.model.Cookbook;

public interface CookbookDaoContract extends JpaRepository<Cookbook, Integer> {

}
