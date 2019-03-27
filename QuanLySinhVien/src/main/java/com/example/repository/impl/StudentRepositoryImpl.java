package com.example.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.entities.Student;
import com.example.repository.StudentRepository;

@Repository
@Transactional
public class StudentRepositoryImpl implements StudentRepository{

	@Autowired
	EntityManager entityManager;
	
	@Override
	public List<Student> getAllStudentYetRemove() {
		String jql = "SELECT u FROM User u Where u.role.role.id = 1 AND u.flag_delete = 0";
		Query query = entityManager.createQuery(jql);
		return query.getResultList();
	}

}
