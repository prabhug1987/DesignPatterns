package com.example.command;

public class TV {
	private String description;

	public TV(String description) {
		// TODO Auto-generated constructor stub
		this.description = description;
	}

	public void on() {
		System.out.println("Turning on the " + description + "TV");
	}

	public void off() {
		System.out.println("Turning off the " + description + " TV");
	}
}
