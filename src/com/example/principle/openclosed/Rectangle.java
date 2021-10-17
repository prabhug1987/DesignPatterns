package com.example.principle.openclosed;

public class Rectangle implements Shape {
	double length;
	double width;
	
	@Override
	public double calculateArea() {
		return length * width;
	}
}
