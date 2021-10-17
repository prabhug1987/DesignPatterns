package com.example.command;

public class GarageDoor {

	private String description;
	
	public GarageDoor(String description) {
		this.description = description;
	}
	
	public void up() {
		System.out.println("door is open");
	}

	public void down() {
		System.out.println("door is closed");
	}

	public void lightOn() {
		System.out.println("lights on");
	}

	public void lightOff() {
		System.out.println("lights off");
	}
	
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Stop the door");
	}
}
