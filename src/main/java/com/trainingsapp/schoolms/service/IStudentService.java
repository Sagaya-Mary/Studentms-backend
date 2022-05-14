package com.trainingsapp.schoolms.service;

import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import org.springframework.validation.annotation.Validated;
import com.trainingsapp.schoolms.dto.AddStudentRequest;
import com.trainingsapp.schoolms.dto.StudentDetails;
import com.trainingsapp.schoolms.dto.UpdateStudentDetails;
import com.trainingsapp.schoolms.entities.Student;
import com.trainingsapp.schoolms.exception.StudentNotFoundException;

@Validated
public interface IStudentService {

	 StudentDetails add(@Valid AddStudentRequest request);
	 
	 List<StudentDetails> addList(@Valid List<AddStudentRequest> request);

	 StudentDetails findById(long id) throws StudentNotFoundException;

	 List<StudentDetails> findByFullName(@NotBlank String firstName, @NotBlank String lastName)
			throws StudentNotFoundException;
	
	 List<StudentDetails> findAll();
	 
	 StudentDetails update(UpdateStudentDetails student);
	 
	 List<StudentDetails> updateList(@Valid List<UpdateStudentDetails> request);
	 
	 void remove(long id);
	

}
