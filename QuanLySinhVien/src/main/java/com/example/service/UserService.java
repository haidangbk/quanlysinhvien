package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.entities.User;

public interface UserService {
	
	public User getUser(String email, String password);
}
