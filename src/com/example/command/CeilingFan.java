package com.example.command;

public class CeilingFan {
	private String location;
	private int speed;

	public static final int OFF = 0;
	public static final int LOW = 1;
	public static final int MEDIUM = 2;
	public static final int HIGH = 3;

	public CeilingFan(String location) {
		// TODO Auto-generated constructor stub
		this.location = location;
	}

	public void high() {
		this.speed = HIGH;
	}

	public void medium() {
		this.speed = MEDIUM;
	}

	public void low() {
		this.speed = LOW;
	}

	public void on() {
		System.out.println("Turning on the " + location + "Fan");
	}

	public void off() {
		System.out.println("Turning off the " + location + "Fan");
	}

	public int getSpeed() {
		return speed;
	}
}
