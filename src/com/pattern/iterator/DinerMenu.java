package com.pattern.iterator;

public class DinerMenu implements Menu{

	static final int MAX_ITEMS = 6;
	int numOfItems = 0;
	MenuItem[] menuItems;

	public DinerMenu() {
		// TODO Auto-generated constructor stub
		menuItems = new MenuItem[MAX_ITEMS];

		addItem("Vegetarian BLT", "(Fakin) Bacon with lettuce a& tomato on whole wheat", true, 2.99);
		addItem("BLT", "Bacon with lettuce & tomato on whole wheat", true, 2.99);
		addItem("Soup of the day", "Soup of the day, with a side of potato salad", true, 3.29);
		addItem("Hotdog", "A hot dog, with a side of potato salad", true, 3.05);

	}

	public void addItem(String name, String description, boolean vegetarian, double price) {
		// TODO Auto-generated method stub
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		if (numOfItems >= MAX_ITEMS) {
			System.err.println("Sorry menu is full! cant add item to menu");
		} else {
			menuItems[numOfItems] = menuItem;
			numOfItems = numOfItems + 1;
		}

	}

	public MenuItem[] getMenuItems() {
		return menuItems;
	}

	public Iterator createIterator() {
		return new DinerMenuIterator(menuItems);
	}
}
