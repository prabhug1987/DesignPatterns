package com.example.singleton;

public class StaticBlockSingleton {

	private static StaticBlockSingleton instance;

	private StaticBlockSingleton() {

	}

	static {
		try {
			instance = new StaticBlockSingleton();
		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException("Exception occured in creating singleton instance");
		}
	}
	
	public static StaticBlockSingleton getInstance() {
		return instance;
	}

}
