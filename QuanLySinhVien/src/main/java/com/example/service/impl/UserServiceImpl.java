package com.example.service.impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.User;
import com.example.repository.UserRepository;
import com.example.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userRepository.getAllUser();
	}

	@Override
	public List<User> getUserYetRemove() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getUserRemoved() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<User> getUser(String email, String password) {
		// TODO Auto-generated method stub
		return userRepository.getUser(email, password);
	}

}
