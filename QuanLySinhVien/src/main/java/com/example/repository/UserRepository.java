package com.example.repository;

import java.util.List;
import java.util.Optional;

import com.example.entities.User;

public interface UserRepository {
	
	public List<User> getAllUser();
	
	public List<User> getUserYetRemove();
	
	public List<User> getUserRemoved();
	
	public Optional<User> getUser(String email, String password);
}
