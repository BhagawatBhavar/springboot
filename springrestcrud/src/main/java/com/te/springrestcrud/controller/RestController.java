package com.te.springrestcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.te.springrestcrud.service.RestInterface;

import com.te.springrestcrud.student.Student;
import com.te.springrestcrud.student.StudentDto;

@org.springframework.web.bind.annotation.RestController
@ResponseBody
public class RestController {
	@Autowired
	RestInterface restInterface;

	@PostMapping(path = "/save", produces = MediaType.APPLICATION_JSON_VALUE)
	public Student save(@RequestBody Student student) {
		restInterface.save(student);
		return student;
	}

	@GetMapping(path = "/remove", produces = MediaType.APPLICATION_JSON_VALUE)
	public Student remove(@RequestBody Student student) {
		restInterface.delect(student);
		return student;        
	}

	@GetMapping(path = "/get", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Student get(@RequestBody String rollno) {
		Student student = restInterface.get(rollno);

		return student;
	}

	@PostMapping(path = "/update", produces = MediaType.APPLICATION_JSON_VALUE)
	public Student update(@RequestBody Student student, @RequestBody String rollno) {
		restInterface.update(student, rollno);
		return student;
	}

	@GetMapping(path = "/getall", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Student> getall() {
		List<Student> getall = restInterface.getall();
		return getall;
	}
	@PostMapping(path = "/add",produces = MediaType.APPLICATION_JSON_VALUE)
	public StudentDto addteacher(@RequestBody StudentDto studentDto) {
		restInterface.addteacher(studentDto);
		return studentDto;
	}
}
