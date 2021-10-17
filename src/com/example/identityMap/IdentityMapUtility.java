package com.example.identityMap;

import java.util.HashMap;
import java.util.Map;

public class IdentityMapUtility {
	
	private static Map personMap = new HashMap();
	
	public static void addPerson(Person p) {
		personMap.put(p.getKey(),p);
	}
	
	public static Person getPerson(Long key) {
		return (Person) personMap.get(key);
	}
}
