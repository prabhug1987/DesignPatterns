package com.example.encaptulation;

public class BeverageTest {

	public static void main(String[] args) {
		Tea tea = new Tea();
		System.out.println("Preparing tea....");
		tea.prepareReceipe();
		
		System.out.println();
		System.out.println("Preparing coffee.....");
		Coffee coffee = new Coffee();
		coffee.prepareReceipe();
		
		
		TeaWithHook teaWithHook = new TeaWithHook();
		CoffeeWithHook coffeeWithHook = new CoffeeWithHook();
		
		System.out.println("\n Making tea....");
		teaWithHook.prepareRecipe();
		System.out.println("\n Making coffee....");
		coffeeWithHook.prepareRecipe();
	}
}
