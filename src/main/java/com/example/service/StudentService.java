package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.response.CreateStudentRequest;
import com.example.demo.response.UpdateStudentRequest;
import com.example.entity.Student;
import com.example.repository.IStudentRepository;

@Service
public class StudentService {

	@Autowired
	IStudentRepository _studentRepository;
	
	public List<Student> getStudents() {
		
		return _studentRepository.findAll();
	}
	
	public Student CreateStudent(CreateStudentRequest student) {
		Student _Student= new Student(student);
		
		Student result = _studentRepository.save(_Student);
		
		return result;
	}
	
	public Student UpdateStudent(UpdateStudentRequest request) {
	 
	  Student res = _studentRepository.findById(request.getId()).get();
	  
	  if(request.getEmail() != null
			  && !request.getEmail().isEmpty()) {
		  res.setEmail(request.getEmail());
	  }
	  
	  if(request.getFirstName() != null
			  && !request.getFirstName().isEmpty()) {
		  res.setFirstName(request.getFirstName());
	  }
	 
	  if(request.getLastName() != null
			  && !request.getLastName().isEmpty()) {
		  res.setLastName(request.getLastName());
	  }
	 
	 
	 
	  res.setLastName(request.getLastName());
	  
	 return  _studentRepository.save(res);
	}
	
	
}
