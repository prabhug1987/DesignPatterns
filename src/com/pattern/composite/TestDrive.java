package com.pattern.composite;

import java.util.ArrayList;


public class TestDrive {

	public static void main(String[] args) {
		
		ArrayList menus = new ArrayList<>();
		MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "breakfast");

		MenuComponent dinerMenu = new Menu("Diner menu", "Lunch");
		MenuComponent coffeeMenu = new Menu("Cafe Menu", "Diner");
		MenuComponent dessertMenu = new Menu("Dessert menu", "Dessert of course");

		MenuComponent allMenus = new Menu("All Menu","All Menus combined");
		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinerMenu);
		allMenus.add(coffeeMenu);
		//allMenus.add(dessertMenu);
		
		dinerMenu.add(new MenuItem("Pasta", "Spaghetti with marinara Sauce, and a slice of sourdough bread", true, 3.89));
		dinerMenu.add(new MenuItem("Apple Pie", "Apple pie with a flakey crust, topped with vannilla icecream", true, 1.59));

		dinerMenu.add(dessertMenu);
		
	    Waitress waitress = new Waitress(allMenus);
	    waitress.printMenu();
		
	}
	
}
