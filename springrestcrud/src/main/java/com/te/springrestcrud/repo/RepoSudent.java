package com.te.springrestcrud.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.te.springrestcrud.student.Student;
import com.te.springrestcrud.student.StudentDto;

@Repository

public class RepoSudent implements RepoInterface{
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("student");
	 EntityManager Manager = factory.createEntityManager();
		EntityTransaction transaction = Manager.getTransaction();
	
		
		@Autowired
		Student student;
	
public void save(Student student) {	
	   student.setId(student.getId());
	   student.setName(student.getName());
	   student.setClassno(student.getClassno());
	   student.setRollno(student.getRollno());
	   
//	   student.setTeacher(student.);
	   
	   
	   
	   
		transaction.begin();
		Manager.persist(student);
		transaction.commit();
		
	}
public void delect(Student student) {
	Student find=Manager.find(Student.class, student.getId());
	Manager.remove(find);
	transaction.begin();
   transaction.commit();

}
@Override
public Student get( String rollno) {
	Student find=Manager.find(Student.class,rollno);
	System.out.println(find);
	transaction.begin();
	transaction.commit();
	return find;
}
@Override
public void update(Student student,String rollno) {
	Student find=Manager.find(Student.class,student.getId());
	System.out.println(find);
	find.setName(student.getName());
	find.setRollno(student.getRollno());
	find.setClassno(student.getClassno());
	
}


@Override
public List<Student> getall() {
	Query createQuery = Manager.createQuery("from student");
	List resultList = createQuery.getResultList();
	return resultList;
	
}
@Override
public Student addteacher(StudentDto studentDto) {
	student.setId(studentDto.getId());
	student.setName(studentDto.getName());
	student.setRollno(studentDto.getRollno());
	
	return student;
}






}