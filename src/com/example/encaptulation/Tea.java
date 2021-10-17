package com.example.encaptulation;

public class Tea extends CoffeineBeverage {

	@Override
	void brew() {
		// TODO Auto-generated method stub
		System.out.println("Steeping the tea");

	}

	@Override
	void addCondiments() {
		// TODO Auto-generated method stub
		System.out.println("Adding lemon");
	}

}
