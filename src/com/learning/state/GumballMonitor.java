package com.learning.state;

public class GumballMonitor {

	private GumBallMachine gumBallMachine;
	
	public GumballMonitor(GumBallMachine gumBallMachine) {
		// TODO Auto-generated constructor stub
		this.gumBallMachine = gumBallMachine;
	}
	
	public void report() {
		// TODO Auto-generated method stub

		try {
			System.out.println("Gumball machine: "+gumBallMachine.getLocation());
			System.out.println("Current Inventory: "+gumBallMachine.getCount()+" Gumballs");
			System.out.println("Current State: "+gumBallMachine.getState());
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
