package com.example.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.security.model.User;
import com.example.security.model.UserData;
import com.example.security.service.UserService;

@Component
public class CommandLineRunner implements org.springframework.boot.CommandLineRunner {

	@Autowired
	UserService userService;

	@Override
	public void run(String... args) throws Exception {
		User user = new User((long) 1, "manu", "$2a$12$.d0NTHopmZvANS65siIJ6OxM83rUohDCYwxDWMoVyqWKcG.nBESwK");
		System.out.println(user);
		userService.saveUserWithoutEncoding(user);
		
		UserData userData = userService.getUser((long) 1);
		
		System.out.println(userData);
	}

}

