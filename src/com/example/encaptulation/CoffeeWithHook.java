package com.example.encaptulation;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CafeineBeverageWithHook{

	@Override
	void brew() {
		// TODO Auto-generated method stub
		System.out.println("Steeping ");
	}

	@Override
	void addCondiments() {
		// TODO Auto-generated method stub
		System.out.println("Adding Sugar and Milk");
	}
	
	public boolean customerWantsCondiments() {
		String answer = getUserInput();
		
		if(answer.toLowerCase().startsWith("y")) {
			return true;
		}else {
			return false;
		}
	}

	private String getUserInput() {
		// TODO Auto-generated method stub
		String answer  = null;
		
		System.out.println("Would you like milk and sugar with your coffee (y/n)?");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			answer = in.readLine();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		if(answer == "no") {
			return "no";
		}
		return answer;
	}

}
