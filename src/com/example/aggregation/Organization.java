package com.example.aggregation;

import java.util.List;

public class Organization {
	
	private List<Person> employees;
	
	public void addEmployee(Person person){
		employees.add(person);
	}

}
