package com.example.repository.impl;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.entities.User;
import com.example.repository.UserRepository;

@Repository
@Transactional
public class UserRepositoryImpl implements UserRepository {

	@PersistenceContext
	EntityManager entityManager;

	@Override
	public User getUser(String email, String password) {
		String jql = "SELECT u FROM User u WHERE u.email = :email AND u.user_password = :password";
		Query query = entityManager.createQuery(jql,User.class).setParameter("email", email).setParameter("password", password);
		return (User) query.getSingleResult();
	}

}
