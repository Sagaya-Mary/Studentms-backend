package com.trainingsapp.schoolms;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.trainingsapp.schoolms.dto.StudentDetails;
import com.trainingsapp.schoolms.frontend.StudentUi;



@SpringBootApplication
public class SchoolmsApplication {

	
	
	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SchoolmsApplication.class, args);
		StudentUi frontend=context.getBean(StudentUi.class);
		frontend.start();
		

	}

}
