package com.pattern.iterator;

import java.util.ArrayList;

public class Waitress {

	ArrayList menus;
	
	public Waitress(ArrayList menus) {
		// TODO Auto-generated constructor stub
		this.menus= menus;
	}

	public void printMenu() {
		java.util.Iterator menuIterator = menus.iterator();
		
		while(menuIterator.hasNext()){
			Menu menu = (Menu) menuIterator.next();
			printMenu(menu.createIterator());
		}
		
	}

	private void printMenu(Iterator iterator) {
		// TODO Auto-generated method stub
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem) iterator.next();
			System.out.println(menuItem.getName());
			System.out.println(menuItem.getDescription());
			System.out.println(menuItem.getPrice());
		}
	}
	
	
	
}
