package com.example.adapter;

public class DuckTestDrive {

	public static void main(String[] args) {
		MallardDuck mallardDuck = new MallardDuck();
		WildTurkey wildTurkey = new WildTurkey();
		
		Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);
		System.out.println("The Turkey says...");
		wildTurkey.gobble();
		wildTurkey.fly();
		
		System.out.println("\n The Duck says...");
		testDuck(mallardDuck);
		
		System.out.println("\nThe TurkeyAdapter says...");
		testDuck(turkeyAdapter);
		
	}

	private static void testDuck(Duck duck) {
		// TODO Auto-generated method stub
		duck.quack();
		duck.fly();
		
	}
}
