package com.example.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.entities.Student;
import com.example.service.StudentService;

@Controller

public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping(value="/list-student")
	public String getAllStudentYetRemove(HttpServletRequest request) {
		List<Student> students = studentService.getAllStudentYetRemove();
		request.setAttribute("students", students);
		return "student/listStudent";
	}
}
