package com.trainingsapp.schoolms.service;

import javax.validation.Valid;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.trainingsapp.schoolms.dto.AddAdmin;

@Validated
public interface IAdminService {

	String add( @Valid AddAdmin admin);
}
