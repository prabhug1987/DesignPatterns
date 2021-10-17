package com.example.principle.liskov;

public class VehicleTest {

	public static void main(String[] args) {
		Vehicle v = new Bus();
		v.getSpeed();
		v.getCubicCapacity();
	}
}
