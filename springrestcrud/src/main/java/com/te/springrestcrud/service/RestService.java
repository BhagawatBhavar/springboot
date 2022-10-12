

package com.te.springrestcrud.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.springrestcrud.repo.RepoInterface;

import com.te.springrestcrud.repo.RepoSudent;
import com.te.springrestcrud.student.Student;
import com.te.springrestcrud.student.StudentDto;

@Service
public class RestService implements RepoInterface {

	@Autowired
	RepoInterface repoInterface;
	@Override
	public void save(Student student) {
		repoInterface.save(student);
		
	}

	@Override
	public void delect(Student student) {
		repoInterface.delect( student);
		
	}

	@Override
	public void update(Student student,String rollno) {
		
         repoInterface.update(student, rollno);
		
	}

	@Override
	public Student get(String rollno) {
		return repoInterface.get(rollno);
		
	}

	@Override
	public List<Student> getall() {
		List<Student> getall = repoInterface.getall();
		return getall;
		
		
	}

	@Override
	public Student addteacher(StudentDto studentDto) {
		return 	repoInterface.addteacher(studentDto);
		
	}

	

	
    
  
}
