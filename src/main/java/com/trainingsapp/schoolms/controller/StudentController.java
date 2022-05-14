package com.trainingsapp.schoolms.controller;


import java.util.List;
import javax.ws.rs.core.*;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trainingsapp.schoolms.dto.AddStudentRequest;
import com.trainingsapp.schoolms.dto.StudentDetails;
import com.trainingsapp.schoolms.dto.UpdateStudentDetails;
import com.trainingsapp.schoolms.service.StudentServiceImp;
import com.trainingsapp.schoolms.util.StudentUtil;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentServiceImp service;

	@Autowired
	private StudentUtil util;

	@PostMapping("/add")
	public StudentDetails save(@RequestBody AddStudentRequest requestData) {

		StudentDetails response = service.add(requestData);
		return response;

	}
	
	@PostMapping("/addList")
	 
	public List<StudentDetails> saveList(@RequestBody List<AddStudentRequest> requestData) {

		List<StudentDetails> response = service.addList(requestData);
		return response;

	}

	@GetMapping("/findbyid/{id}")
	public StudentDetails findById(@PathVariable("id") long id) {
		StudentDetails detail = service.findById(id);
		return detail;
	}

	@GetMapping("/find/{fname},{lname}")
	public List<StudentDetails> findByFullName(@PathVariable("fname") String firstName,
			@PathVariable("lname") String lastName) {
		List<StudentDetails> response = service.findByFullName(firstName, lastName);
		return response;
	}
	
	@GetMapping("/findall")
	public List<StudentDetails> findAll(){
		return service.findAll();
	}
	
	@PutMapping("/update/add")
	public StudentDetails update( @RequestBody UpdateStudentDetails detail)
	{

		StudentDetails student=service.update(detail);
		return student;
	}

	@PutMapping("/update/addList")
	public List<StudentDetails> updateList( @RequestBody List<UpdateStudentDetails> detail)
	{

		List<StudentDetails> student=service.updateList(detail);
		return student;
	}

	@DeleteMapping("/remove/{id}")
	public void remove(@PathVariable("id") long id) {
		service.remove(id);
		
	}
}
