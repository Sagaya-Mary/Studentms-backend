
package com.trainingsapp.schoolms.frontend;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.trainingsapp.schoolms.dto.AddStudentRequest;
import com.trainingsapp.schoolms.dto.StudentDetails;
import com.trainingsapp.schoolms.entities.Student;
import com.trainingsapp.schoolms.exception.StudentNotFoundException;
import com.trainingsapp.schoolms.service.IStudentService;

@Component
public class StudentUi {

	@Autowired
	private IStudentService ser;

	public void start() {
		try {
			
			//AddStudentRequest request = new AddStudentRequest("sagaya", "mary", "31-08-2000");
			AddStudentRequest request1 = new AddStudentRequest("stella", "mary", "31-08-2000");
			AddStudentRequest request2 = new AddStudentRequest("jesintha", "mary", "31-08-2000");
			List<AddStudentRequest> list=new ArrayList<AddStudentRequest>();
			list.add(request1);
			list.add(request2);
			//StudentDetails student = ser.add(request);
//			List<StudentDetails> st=ser.addList(list);
//			for (Student s : st) {
//				displayStudent(s);
//			}
//			System.out.println(st);
			//Long id = student.getId();
			//String firstName = student.getFirstName();
			//String lastName = student.getLastName();
			//StudentDetails findId = ser.findById(id);
//			List<StudentDetails> findName = ser.findByFullName(firstName, lastName);
//			for (StudentDetails s : findName) {
//				display(s);
//			}
//			display(student);
//			display(findId);
		} catch (StudentNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

	public void display(StudentDetails student) {
		System.out.println("Id = " + student.getId() + "  - Full Name = " + student.getFirstName() + ""
				+ student.getLastName() + "  - BirthDate = " + student.getBirthDate());
	}

	public void displayStudent(Student student) {
		System.out.println("Id = " + student.getId() + "  - Full Name = " + student.getFirstName() + ""
				+ student.getLastName() + "  - BirthDate = " + student.getBirthDate());
	}

}
