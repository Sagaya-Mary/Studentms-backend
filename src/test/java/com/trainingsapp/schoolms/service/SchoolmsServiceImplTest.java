package com.trainingsapp.schoolms.service;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.trainingsapp.schoolms.dto.AddStudentRequest;
import com.trainingsapp.schoolms.dto.StudentDetails;
import com.trainingsapp.schoolms.entities.Student;
import com.trainingsapp.schoolms.util.DateUtil;
//import com.trainingsapp.schoolms.util.StudentUtil;
import com.trainingsapp.schoolms.util.StudentUtil;

@Import({StudentServiceImp.class,StudentUtil.class,DateUtil.class})
@DataJpaTest
@ExtendWith(SpringExtension.class)
public class SchoolmsServiceImplTest {

	
	@Autowired
	private IStudentService service;
	@Autowired
	private EntityManager em;
	
	@Autowired
	private DateUtil util;
	@Test
	public void addStudentTest() {
		String fname="sagaya";
		String lname="mary";
		String dob="21-09-2000";
		LocalDate date=util.convertToDate(dob);
		AddStudentRequest request=new AddStudentRequest();
		request.setFirstName(fname);
		request.setLastName(lname);
		request.setBirthDate(dob);
		StudentDetails detail=service.add(request);
		assertEquals(fname, detail.getFirstName());
		assertEquals(lname,detail.getLastName());
		assertEquals(dob,detail.getBirthDate());
		TypedQuery<Student> student=em.createQuery("from Student",Student.class);
		List<Student> list=student.getResultList();
		Student stu=list.get(0);
		assertEquals(fname,stu.getFirstName());
		assertEquals(lname,stu.getLastName());
		//assertEquals(date,stu.getBirthDate());
	}
}
