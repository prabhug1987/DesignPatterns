package com.example.cohesion;

//a highly cohesion class focused on what it should be doing
public class HighCohesionStaff {
	private int salary;
	private String emailAddress;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

}
