package com.example.DataMapper;

import java.io.Serializable;

/**
 * @author Prabhu G
 *
 */
public class Student implements Serializable {
	
	private static final long serialVersionUID = -1;
	
	private int studentId;
	private String name;
	private char grade;
	
	/**
	 * Use this constructor to create a student with all details
	 * @param studentId as unique student id
	 * @param name as unique student name
	 * @param grade as respective grade of student
	 * 
	 */
	public Student(final int studentId,final String name,final char grade) {
		// TODO Auto-generated constructor stub
		this.studentId = studentId;
		this.name = name;
		this.grade = grade;
	}
	
	/**
	 * @return the student id
	 */
	public int studentId() {
		return studentId;
	}
	
	/**
	 *  @param set studentId as unique student id
	 */
	public void setStudentId(final int studentId) {
		this.studentId = studentId;
	}

	/**
	 * @return the name as 'name' of the student
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name as  the 'name' of the student
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the grade as grade of the student
	 */
	public char getGrade() {
		return grade;
	}

	/**
	 * @param grade to set the grade of the student
	 */
	public void setGrade(char grade) {
		this.grade = grade;
	}

	/*
	 * 
	 */
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", grade=" + grade + "]";
	}

	
	/**
	 * 
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + grade;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + studentId;
		return result;
	}
	
	/**
	 * 
	 */

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (grade != other.grade)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (studentId != other.studentId)
			return false;
		return true;
	}
	
		
}	


