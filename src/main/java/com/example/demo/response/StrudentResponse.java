package com.example.demo.response;

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
public class StrudentResponse {

	
	@JsonIgnore
	private long id;
	
	@JsonProperty("first_Name")
	private String firstName;
	
	private String lastName;

   
	
	
	
	


	
}
