package com.pattern.iterator;

import java.util.List;

public class PanCakeHouseMenuIterator implements Iterator {
	List<MenuItem> menuItems;
	int position = 0;

	public PanCakeHouseMenuIterator(List<MenuItem> menuItems) {
		// TODO Auto-generated constructor stub
		this.menuItems = menuItems;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub

		if (position >= menuItems.size() || menuItems.get(position) == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		MenuItem menuItem = (MenuItem) menuItems.get(position);
		position = position + 1;
		return menuItem;

	}
	
	
	@Override
	public void remove() {
		// TODO Auto-generated method stub
		if (position <= 0) {
			throw new IllegalArgumentException("You cant remove an item until you have done at leat one next()");
		}

		if (menuItems.get(position) != null) {
			menuItems.remove(position);
		}
	}

}
