package com.example.composition;
//a car owns engine
//if car is destroyed then engine also
//

public class Car {
	// creates an engine object
	private final Engine engine;
	
	public Car() {
		engine = new Engine();
	}

}
