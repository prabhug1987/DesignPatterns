package com.pattern.iterator;

import java.util.Hashtable;

public class CaffeeMenu implements Menu {

	Hashtable menuItems;

	public CaffeeMenu() {
		// TODO Auto-generated constructor stub
		menuItems = new Hashtable<>();
		addItem("Veggie Burger and Air Fries", "Veggie burger on a whole wheat bun, lettuce,  tomatot, and fries", true,
				3.99);
		addItem("Soup of the day", "A cup of the soup of the day, with a side salad", false, 3.69);
		addItem("Soup of the day", "A cup of the soup of the day, with a side salad", false, 3.69);

	}

	private void addItem(String name, String description, boolean vegitarian, double price) {
		// TODO Auto-generated method stub
		MenuItem menuItem = new MenuItem(name, description, vegitarian, price);
		menuItems.put(menuItem.getName(), menuItem);
	}

	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return menuItems.values().iterator();
	}

}
