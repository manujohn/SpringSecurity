package com.example.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.security.model.User;
import com.example.security.model.UserData;
import com.example.security.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/{id}")
	public UserData getUser(@PathVariable("id") Long id) {
		return userService.getUser(id);
	}
	
	@PostMapping("/")
	public UserData saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}
}
