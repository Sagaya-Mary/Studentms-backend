package com.trainingsapp.schoolms.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;


public class AddAdmin {

	@NotBlank(message="name cannot be blank")
	private String admin_name;
	
	@Pattern(regexp="^[a-zA-Z0-9]{8}",message="length must be 8")  
	private String password;
	
	public String getAdmin_name() {
		return admin_name;
	}
	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
