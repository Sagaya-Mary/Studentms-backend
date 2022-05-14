package com.trainingsapp.schoolms.exception;

import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CentralizedExceptionHandler {
	
	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ExceptionHandler(StudentNotFoundException.class)
	public String StudentNotFound(StudentNotFoundException e) {
		return e.getMessage();
	}

	 @ResponseStatus(HttpStatus.BAD_REQUEST)
	    @ExceptionHandler(ConstraintViolationException.class)
	    public String handleContraintViolation(ConstraintViolationException e){
	        return e.getMessage();
	    }
}
