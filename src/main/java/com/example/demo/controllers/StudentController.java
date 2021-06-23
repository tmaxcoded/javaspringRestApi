package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.response.StrudentResponse;

@RestController
@RequestMapping("/api/student/")
public class StudentController {
 
	@Value("${app.name: going hey wire!!}")
	private String appName ;
	@GetMapping("/get")
	public StrudentResponse getStudents() {
		StrudentResponse response = new StrudentResponse(1,"tmax","noda");
		
		return response;
	}
}
