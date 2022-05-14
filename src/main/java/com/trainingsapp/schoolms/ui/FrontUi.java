package com.trainingsapp.schoolms.ui;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.trainingsapp.schoolms.dto.AddStudentRequest;
import com.trainingsapp.schoolms.dto.StudentDetails;
import com.trainingsapp.schoolms.dto.UpdateStudentDetails;
import com.trainingsapp.schoolms.entities.Student;
import com.trainingsapp.schoolms.service.StudentServiceImp;

@Transactional
@Component
public class FrontUi {
	

	@Autowired
	private StudentServiceImp service;
	public void start() {
		AddStudentRequest request1 =new AddStudentRequest();
		request1.setFirstName("sagaya");
		request1.setLastName("mary");
		request1.setBirthDate("31-08-2000");
	    System.out.println("First Student detail added");
	    
	    
		StudentDetails student1=service.add(request1);
	    print(student1);
	    
	    
		System.out.println("Second Student detail added");
		AddStudentRequest request2 =new AddStudentRequest();
		request2.setFirstName("hema");
		request2.setLastName("latha");
		request2.setBirthDate("10-01-2000");
		StudentDetails student2=service.add(request2);
		print(student2);
		
		
		System.out.println("Student detail get by id");
		StudentDetails studentById=service.findById(student1.getId());
		print(studentById);
		
		
		System.out.println("All the Student Details print");
		List<StudentDetails> list=service.findAll();
		for(StudentDetails detail:list) {
			print(detail);
		}
		
	    System.out.println("Update the Student Details");
	    UpdateStudentDetails update=new UpdateStudentDetails();
	    update.setId(1);
	    update.setFirstName("yuva");
	    update.setLastName("rani");
	    update.setBirthDate("26-03-1999");
	    StudentDetails studentDetails=service.update(update);
	    print(studentDetails);
	    
			
	}

	public void print(StudentDetails detail) {
		System.out.println("StudentDetails : id = "+detail.getId()+"fname = "+detail.getFirstName()+"lname = "+detail.getLastName()+"dob = "+detail.getBirthDate());
	}
	

}
