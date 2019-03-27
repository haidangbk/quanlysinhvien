package com.example.repository.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.entities.Student;
import com.example.repository.StudentRepository;

@Repository
@Transactional
public class StudentRepositoryImpl implements StudentRepository{

	@Override
	public List<Student> getAllStudentYetRemove() {

		return null;
	}

}
