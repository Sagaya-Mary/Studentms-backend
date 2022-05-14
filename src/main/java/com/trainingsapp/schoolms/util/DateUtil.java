package com.trainingsapp.schoolms.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Component;

@Component
public class DateUtil {

	private final String pattern = "dd-MM-yyyy";
	private DateTimeFormatter format = DateTimeFormatter.ofPattern(pattern);
	
	public LocalDate convertToDate(String txt) {
		LocalDate date = LocalDate.parse(txt, format);
		return date;

	}

	public String convertToText(LocalDate date) {
		String text = date.format(format);
		return text;
	}
}
