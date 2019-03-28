package com.example.repository;

import java.util.List;
import java.util.Optional;

import com.example.entities.User;

public interface UserRepository {
	
	public User getUser(String email, String password);
}
