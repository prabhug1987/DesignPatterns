package com.pattern.composite;

import java.util.Iterator;

public class MenuItem extends MenuComponent{

	String name;
	String description;
	boolean vegetarian;
	double price;
	
	public MenuItem(String name,String description, boolean vegetarian,double price) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return description;
	}
	
	@Override
	public boolean isVegetarian() {
		// TODO Auto-generated method stub
		return vegetarian;
	}
	
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}
	
	public void print() {
		System.out.println(""+getName());
		if(isVegetarian()) {
			System.out.println("(v)");
		}
		System.out.println(", "+getPrice());
		System.out.println(", "+getDescription());
	}

	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new NullIterator();
	}
	
	
	
}
