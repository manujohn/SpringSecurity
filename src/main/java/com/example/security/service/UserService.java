package com.example.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.security.model.User;
import com.example.security.model.UserData;
import com.example.security.repository.UserRepo;

@Service
public class UserService {

	@Autowired
	UserRepo userRepo;
	
	@Autowired
	PasswordEncoder passwordEncoder;

	public UserData getUser(Long id) {
		User user = userRepo.getByUserId(id);

		return new UserData(user.getUserId(), user.getUserName());
	}

	public UserData saveUser(User userd) {
		userd.setUserPassword(passwordEncoder.encode(userd.getUserPassword()));
		User user = userRepo.save(userd);
		return new UserData(user.getUserId(), user.getUserName());
	}

}
