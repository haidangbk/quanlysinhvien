package com.example.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.entities.User;
import com.example.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping(value= {"/","/home"})
	public String home() {
		return "index";
	}
	
	@GetMapping(value = "/login")
	public String login() {
		return "login";
	}
	
	@PostMapping(value="/login")
	public String login(@RequestParam (name="email")String email, @RequestParam(name="password")String password) {
		User user = userService.getUser(email, password);
		if(user != null) {
			return "redirect:/home";
		}
		return "login";
	}
	
}
