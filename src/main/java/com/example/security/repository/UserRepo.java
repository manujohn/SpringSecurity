package com.example.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.security.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

	User getByUserId(Long id);

	User findByUserName(String username);

}
