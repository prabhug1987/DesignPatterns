package com.example.identityMap;

public class PersonDatabase {
	
	public static Person finder(int key) {
		Person person = IdentityMapUtility.getPerson(key);
		
		if(person == null) {
			IdentityMapUtility.addPerson(person);
		}
		
		return person;
	}

}
