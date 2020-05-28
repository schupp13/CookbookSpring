package com.cookbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cookbook.model.*;
import com.cookbook.repo.UserDaoContract;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserDaoContract dao;
	
	@GetMapping("/all")
	public List<User> getAllUsers() {
		return dao.findAll();
	}
	
	@PostMapping("/create")
	public User  createUser(@RequestBody User u) {
		dao.save(u);
		return u;
	}
	
	@DeleteMapping("/delete/{id}")
	public User deleteById(@PathVariable int id) {
		User deleted = dao.getOne(id);
		dao.deleteById(id);
		return deleted;
	}
	
	@PutMapping("/update") 
	public User updateUser(@RequestBody User u) {
		dao.save(u);
		return u;
	}
	
	@GetMapping("/{id}")
	public User getUserById(@PathVariable int id) {
		return dao.getOne(id);
		
	}
	
}
