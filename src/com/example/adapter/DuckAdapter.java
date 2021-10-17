package com.example.adapter;

import java.util.Random;

public class DuckAdapter implements Turkey {

	Duck duck;
	Random  random;

	public DuckAdapter(Duck duck) {
		this.duck = duck;
		this.random = new Random();
	}

	@Override
	public void gobble() {
		// TODO Auto-generated method stub
		duck.quack();
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		if(random.nextInt(5) == 0) {
			   duck.fly();
		}
	}
}
