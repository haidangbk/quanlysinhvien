package com.example.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.User;
import com.example.repository.LecturerRepository;
import com.example.service.LecturerService;


@Service
@Transactional
public class LecturerServiceImpl implements LecturerService{

	@Autowired
	LecturerRepository lecturerRepository;
	
	@Override
	public List<User> getAllLecturerYetRemove() {

		return lecturerRepository.getAllLecturerYetRemove();
	}

}
