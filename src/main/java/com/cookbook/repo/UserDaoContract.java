package com.cookbook.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cookbook.model.User;

public interface UserDaoContract extends JpaRepository<User, Integer> {

}
