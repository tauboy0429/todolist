package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@CrossOrigin(maxAge=3600,allowedHeaders = "*")
@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserRepository ur;
	
	@GetMapping("/queryAll")
	public List<User> queryAll()
	{
		return ur.findAll();
	}
	
	@PostMapping("/Add")
	public User Add(@RequestBody User user)
	{
		return ur.save(user);
	}
	
	@PostMapping("/Delete")
	public void Delete(Integer uid)
	{
		ur.deleteById(uid);
	}
}
