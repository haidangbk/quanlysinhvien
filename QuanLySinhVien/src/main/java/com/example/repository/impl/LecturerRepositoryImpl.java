package com.example.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.entities.User;
import com.example.repository.LecturerRepository;

@Repository
@Transactional
public class LecturerRepositoryImpl implements LecturerRepository {

	@PersistenceContext
	EntityManager entityManager;

	@Override
	public List<User> getAllLecturerYetRemove() {
		String jql = "SELECT u FROM User u WHERE u.role.role_id = 2 AND u.flag_delete = 0";
		Query query = entityManager.createQuery(jql);
		return query.getResultList();
	}

}
