package com.example.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.entities.User;
import com.example.service.LecturerService;

@Controller
public class LecturerController {
	
	@Autowired
	LecturerService lecturerService;
	
	@GetMapping(value="/list-lecturer")
	public String getAllLecturerYetRemove(HttpServletRequest request) {
		List<User> lecturers = lecturerService.getAllLecturerYetRemove();
		request.setAttribute("lecturers", lecturers);
		return "lecturer/listLecturer";
	}
}
