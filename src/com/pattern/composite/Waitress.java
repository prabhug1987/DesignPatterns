package com.pattern.composite;

import java.util.ArrayList;

public class Waitress {

	MenuComponent menus;
	
	public Waitress(MenuComponent menus) {
		// TODO Auto-generated constructor stub
		this.menus= menus;
	}

	public void printMenu() {
		menus.print();
	}
	
}
