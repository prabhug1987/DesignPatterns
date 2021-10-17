package com.pattern.iterator;

public class DinerMenuIterator implements Iterator {
	MenuItem[] menuItems;

	int position = 0;

	public DinerMenuIterator(MenuItem[] menuItems) {
		// TODO Auto-generated constructor stub
		this.menuItems = menuItems;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub

		if (position >= menuItems.length || menuItems[position] == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		MenuItem menuItem = menuItems[position];
		position = position + 1;
		return menuItem;

	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		if (position <= 0) {
			throw new IllegalArgumentException("You cant remove an item until you have done at leat one next()");
		}

		if (menuItems[position] != null) {
			for (int i = 0; i < menuItems.length - 1; i++) {
				menuItems[position] = menuItems[position + 1];
			}
			menuItems[menuItems.length - 1] = null;

		}
	}

}
