package com.example.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.security.model.User;
import com.example.security.service.UserService;

@Component
public class CommandLineRunner implements org.springframework.boot.CommandLineRunner {

	@Autowired
	UserService userService;

	@Override
	public void run(String... args) throws Exception {
		User user = new User((long) 1, "manu", "$2a$12$fGlaIauK4bbJVSpi4vEIPObPdeC3QeLLPRock3cJ6Skiy88/T8dY2");
		System.out.println(user);
		userService.saveUser(user);
	}

}
