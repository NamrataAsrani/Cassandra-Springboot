package com.cassandra.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cassandra.demo.Model.User;
import com.cassandra.demo.Repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserRepository repo;
	
	@PostMapping("/adduser")
	public User addUser(@RequestBody User user) {
		repo.save(user);
		return user;
		
	}
	
	@GetMapping("/alluser")
	public List<User> getAllUsers(){
		List<User> ul=repo.findAll();
		
		return ul;
	}
	
	
  @GetMapping("/alluserbyage/{age}")
	public List<User> getfilterBYAge(@PathVariable int age){
		List<User> ul=repo.findByAgeGreaterThan(age);
		return ul;
	}
	
@PostConstruct
	public void saveUser() {
		User user = new User(4, "Mohit", "Pune", 28,Arrays.asList("information-technology","Information-science"));
		repo.save(user);
	}
	
	

}
