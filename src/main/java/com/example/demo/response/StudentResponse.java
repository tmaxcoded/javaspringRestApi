package com.example.demo.response;

import com.example.entity.Student;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentResponse {

	
	public StudentResponse(Student resturnedStudent) {
		// TODO Auto-generated constructor stub
		firstName = resturnedStudent.getFirstName();
		lastName = resturnedStudent.getLastName();
		email = resturnedStudent.getEmail();
	}

	@JsonIgnore
	private long id;
	
	
	private String firstName;
	
	private String lastName;
	
	private String email;

   
	
	
	
	


	
}
