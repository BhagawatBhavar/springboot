package com.te.springrest.employee;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
    
	private String name;
	private int id;
	private String designation;
}
