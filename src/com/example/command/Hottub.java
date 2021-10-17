package com.example.command;

public class Hottub {
    private String description;
    
    public Hottub(String description) {
		// TODO Auto-generated constructor stub
    	this.description = description;
	}
    
	public void on() {
		System.out.println("Turning on the "+description+" Hottub");
	}

	public void off() {
		System.out.println("Turning off the "+description+ " Hottub");
	}
}
