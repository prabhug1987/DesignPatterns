package com.pattern.iterator;

import java.util.ArrayList;

import com.pattern.composite.DessertMenu;
import com.pattern.composite.PancakeHouseMenu;

public class TestDrive {

	public static void main(String[] args) {

		
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();;
		DinerMenu dinerMenu = new DinerMenu();
		CaffeeMenu coffeeMenu = new CaffeeMenu();
			
		
		Waitress waitress = new Waitress();
		waitress.printMenu();
	}

}
