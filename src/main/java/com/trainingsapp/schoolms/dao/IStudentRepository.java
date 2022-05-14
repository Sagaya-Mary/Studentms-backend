package com.trainingsapp.schoolms.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.trainingsapp.schoolms.entities.Student;

@Repository
public interface IStudentRepository extends JpaRepository<Student, Long> {

	@Query("from Student where firstName=:first and lastName=:second")
	public List<Student> findByFirstnameAndLastname(@Param("first") String firstName, @Param("second") String lastName);

}
