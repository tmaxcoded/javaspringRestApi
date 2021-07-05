package com.example.demo.response;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateStudentRequest {

	@NotNull(message="student id is required")
	private Long Id;
	private String firstName;
	private String LastName;
	private String email;
	
	
}
