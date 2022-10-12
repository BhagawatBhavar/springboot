package com.te.springrestcrud.repo;

import java.util.List;

import com.te.springrestcrud.student.Student;
import com.te.springrestcrud.student.StudentDto;

//extends JpaRepository<Student,Integer>
public interface RepoInterface  {
   
	
	public void save(Student student);
	public void delect(Student student);
	
	
	public List<Student> getall();
	public Student get(String rollno);
	void update(Student student, String rollno);
	public Student addteacher(StudentDto studentDto);
	
	
}
