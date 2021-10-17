package com.pattern.iterator;

import java.util.ArrayList;

import com.pattern.iterator.Iterator;
import com.pattern.iterator.Menu;
import com.pattern.iterator.MenuItem;
import com.pattern.iterator.PanCakeHouseMenuIterator;

public class PancakeHouseMenu implements Menu {

	ArrayList menuItems;

	public PancakeHouseMenu() {
		// TODO Auto-generated constructor stub
		menuItems = new ArrayList<>();
		addMenuItem("K&b's Pancake Breakfast", "pan cake with scrambled eggs, and toast", true, 2.99);

		addMenuItem("K&b's Pancake Breakfast", "pan cake with fried eggs, and sauce", true, 2.99);

		addMenuItem("K&b's Pancake Breakfast", "pan cake with fresh blue berries", true, 3.49);

		addMenuItem("Waffles", "Waffles with your choice of blueberrries or strawberries", true, 3.49);

	}

	private ArrayList addMenuItem(String name, String description, boolean vegetarian, double price) {
		// TODO Auto-generated method stub

		menuItems.add(new MenuItem(name, description, vegetarian, price));
		return menuItems;
	}
	
	
	/*public ArrayList getMenuItems() {
		return menuItems;
	}*/
	
	public Iterator createIterator(){
		return new PanCakeHouseMenuIterator(menuItems);                                                                                                                                                                                                                                          
	}
	
	

}
