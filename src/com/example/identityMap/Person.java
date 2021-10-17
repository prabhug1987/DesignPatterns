package com.example.identityMap;

public class Person {
	private int key;
	private String firstName;
	private String noOfDependents;

	public Person(int key, String firstName, String noOfDependents) {
		super();
		this.key = key;
		this.firstName = firstName;
		this.noOfDependents = noOfDependents;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getNoOfDependents() {
		return noOfDependents;
	}

	public void setNoOfDependents(String noOfDependents) {
		this.noOfDependents = noOfDependents;
	}

}
