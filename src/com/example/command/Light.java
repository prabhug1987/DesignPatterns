package com.example.command;

public class Light {
    private String description;
    
    public Light(String description) {
		// TODO Auto-generated constructor stub
    	this.description = description;
	}
    
	public void on() {
		System.out.println("Turning on the "+description+"light");
	}

	public void off() {
		System.out.println("Turning off the "+description+ " light");
	}
}
