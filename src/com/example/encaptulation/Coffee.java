package com.example.encaptulation;

public class Coffee extends CoffeineBeverage {

	@Override
	void brew() {
		// TODO Auto-generated method stub
		System.out.println("Dripping coffee through the filter");

	}

	@Override
	void addCondiments() {
		// TODO Auto-generated method stub
		System.out.println("Adding sugar and milk");
	}

}
