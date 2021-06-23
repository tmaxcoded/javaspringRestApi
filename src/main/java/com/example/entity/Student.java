package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="student")
public class Student {

	@Id
	@GeneratedValue
	@Column(name="id")
	public long id;
	
	@Column(name="firstName")
	public String firstName;
	
	@Column(name="lastName")
	public String lastName;
	
	@Column(name="email")
	public String email;
}
