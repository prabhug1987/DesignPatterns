package com.example.singleton;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {

	public static void main(String[] args) {
		EagerInitializationSingleton one = EagerInitializationSingleton.getInstance();
		EagerInitializationSingleton two = null;
			
		try {
			Constructor[] constructors = EagerInitializationSingleton.class.getConstructors();
			for(Constructor constructor:constructors) {
				constructor.setAccessible(true);
				two = (EagerInitializationSingleton)constructor.newInstance();

				System.out.println(one.hashCode());
				System.out.println(two.hashCode());
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}
