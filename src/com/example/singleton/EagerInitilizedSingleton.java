package com.example.singleton;

public class EagerInitilizedSingleton {

	private EagerInitilizedSingleton() {
		
	}
	
	public static EagerInitilizedSingleton getInstance() {
		return new EagerInitilizedSingleton();
	}
}
