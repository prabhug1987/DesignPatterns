package com.example.mvc;

public class MvcPatternDemo {
	
	public static void main(String[] args) {
		Student student = retriveStudentFromDatabase();
		StudentView studentView = new StudentView();
		
		StudentController studentController = new StudentController(student, studentView);
		studentController.updateView();
		
		student.setName(" Prabhu");
		
		studentController.updateView();
		
	}

	private static Student retriveStudentFromDatabase() {
		Student student = new Student();
		student.setName("Robert");
		student.setRollNo("10");
		return student;
	}
}
