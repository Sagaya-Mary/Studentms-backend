package com.trainingsapp.schoolms.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.trainingsapp.schoolms.dto.StudentDetails;
import com.trainingsapp.schoolms.entities.Student;

@Component
public class StudentUtil {
	
	  @Autowired
      private DateUtil dateutil;
	
	public StudentDetails convert(Student student) {
		Long id = student.getId();
		String firstName = student.getFirstName();
		String lastName = student.getLastName();
		LocalDate birthDate = student.getBirthDate();
		String date = dateutil.convertToText(birthDate);
		StudentDetails detail = new StudentDetails();
		detail.setId(id);
		detail.setFirstName(firstName);
		detail.setLastName(lastName);
		detail.setBirthDate(date);
		return detail;
	}

	public List<StudentDetails> convertToStudentList(Collection<Student> students) {
		List<StudentDetails> list = new ArrayList<>();
		for (Student student : students) {
			StudentDetails desired = convert(student);
			list.add(desired);
		}
		return list;
	}
	
	
}
