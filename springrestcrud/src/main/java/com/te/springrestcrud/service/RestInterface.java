package com.te.springrestcrud.service;

import java.util.List;

import com.te.springrestcrud.student.Student;
import com.te.springrestcrud.student.StudentDto;

public interface RestInterface {

	
	public void save(Student student);
	public void delect(Student student);
	public void update(Student student,String rollno);
	public Student get(String rollno);
	public List<Student> getall();
	public Student addteacher(StudentDto studentDto);
	
}
