package com.example.demo.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.response.CreateStudentRequest;
import com.example.demo.response.StudentResponse;
import com.example.demo.response.UpdateStudentRequest;
import com.example.entity.Student;
import com.example.service.StudentService;

@RestController
@RequestMapping("/api/student/")
public class StudentController {
 
	
	
	@Autowired(required = true)
	StudentService studentService;
	
	@GetMapping("/get")
	public List<Student> getStudents() {
		return studentService.getStudents();
		//return response;
	}
	
	@PostMapping("/create")
	public StudentResponse createStudent(@Valid @RequestBody CreateStudentRequest request) {
		Student  resturnedStudent = studentService.CreateStudent(request);
		return new StudentResponse(resturnedStudent);
	}
	
	@PutMapping("/update")
	public StudentResponse UpdateStudent( @Valid @RequestBody UpdateStudentRequest request) {
		Student returnedStudentUpdate = studentService.UpdateStudent(request);
		
		return new StudentResponse(returnedStudentUpdate);
	}
	
}
