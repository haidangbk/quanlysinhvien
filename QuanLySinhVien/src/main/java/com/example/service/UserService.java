package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.entities.User;

public interface UserService {
	public List<User> getAllUser();

	public List<User> getUserYetRemove();
	
	public List<User> getUserRemoved();
	
	public Optional<User> getUser(String email, String password);
}
