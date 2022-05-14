package com.trainingsapp.schoolms.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trainingsapp.schoolms.dao.IAdminRepository;
import com.trainingsapp.schoolms.dto.AddAdmin;
import com.trainingsapp.schoolms.entities.Admin;

@Service
@Transactional
public class AdminService implements IAdminService {

	@Autowired
	private IAdminRepository repository;
	
	
	
	@Override
	public String add(AddAdmin request) {
		Admin admin=new Admin();
		admin.setAdmin_name(request.getAdmin_name());
		admin.setPassword(request.getPassword());
		repository.save(admin);	
		return "admin details successfully registered";
		
		
	}

	
	
}
