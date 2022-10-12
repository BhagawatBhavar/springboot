package com.te.springrest.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.te.springrest.employee.Employee;

@Controller
@ResponseBody
public class DemoController {
	List<Employee> asList = Arrays.asList(new Employee("chotachhatri",1,"chori"),new Employee("babubhaiya", 2, "khopdai tod sale ki"));
	@GetMapping(path = "/test",produces =MediaType.APPLICATION_JSON_VALUE)
//	public Employee test() {
////		;Employee employee = new Employee();
//		employee.setDesignation("tester");
//		employee.setId(1);
//		employee.setName("veda");
//		return employee
	
	@PostMapping(path = "/save",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee save(@RequestBody Employee employee) {
		System.out.println(employee);
		return employee;
	}
	@GetMapping(path = "/get",produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee get(@RequestParam String name,Integer id) {
		List<Employee> collect = asList.stream().filter(e1->e1.getName().equals(name)).collect(Collectors.toList());
		
		if (collect.get(0).getId()>id) {
			return collect.get(0);
		} 
		return new Employee(name, id, name);
	}
	
}
