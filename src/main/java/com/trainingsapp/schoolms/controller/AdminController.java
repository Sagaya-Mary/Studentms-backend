package com.trainingsapp.schoolms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trainingsapp.schoolms.dto.AddAdmin;
import com.trainingsapp.schoolms.service.AdminService;


@RestController
@RequestMapping("/api")
public class AdminController {

	@Autowired
	private AdminService service;
	
	
	@PostMapping("/login")
	public String add(AddAdmin admin) {
		String msg=service.add(admin);
		return msg;
		
	}
	
}
