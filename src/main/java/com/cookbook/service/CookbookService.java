package com.cookbook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cookbook.model.Cookbook;
import com.cookbook.repo.CookbookDaoContract;

@Service
public class CookbookService {
	
	@Autowired
	CookbookDaoContract cd;

	public List<Cookbook> getAllCookbooks() {
		return cd.findAll();
	}

	public Cookbook getCookbookById(int id) {	
		return cd.findById(id).orElse(null);
	}

	public String deleteCookbookById(int id) {
		// TODO Auto-generated method stub
		 cd.deleteById(id);
		return "User with id: " + id + " was deleted.";
	}

	public Cookbook updateCookbookById(Cookbook cookbook) {
		return cd.save(cookbook);
	}

	public Cookbook createCookbook(Cookbook cookbook) {
		// TODO Auto-generated method stub
		return cd.save(cookbook);
	}

	public List<Cookbook> getCookbooksByUserId(int id) {
		return cd.getCookbooksByUserId(id);
	}
	
	
	
}
