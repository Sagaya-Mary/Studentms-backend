package com.trainingsapp.schoolms.dto;

import javax.validation.constraints.NotBlank;

public class AddStudentRequest {
	@NotBlank
	private String firstName;
	@NotBlank
	private String lastName;
	private String birthDate;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public AddStudentRequest() {

	}

	public AddStudentRequest(String firstName, String lastName, String birthDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
	}

}
