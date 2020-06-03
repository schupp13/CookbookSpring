package com.cookbook.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cookbook.model.User;

@Repository
public interface UserDaoContract extends JpaRepository<User, Integer> {

}
