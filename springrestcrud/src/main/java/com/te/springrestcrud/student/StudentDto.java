package com.te.springrestcrud.student;

import javax.persistence.Id;

import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Component
public class StudentDto {

	@Id
	private int id;
	private String name;
	private String rollno;
	private String classno;
	private int tid;
}
