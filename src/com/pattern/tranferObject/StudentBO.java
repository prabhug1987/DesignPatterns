package com.pattern.tranferObject;

import java.util.List;

public interface StudentBO {
	
	List<String> getAllStudents();
	void updateStudent();
	void deleteStudent();
	void addStudent();

}
