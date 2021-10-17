package com.learning.state;

public class HasQuarterState implements State {

	GumBallMachine gumBallMachine;
	
	public HasQuarterState(GumBallMachine gameBallMachine) {
		// TODO Auto-generated constructor stub
		this.gumBallMachine = gumBallMachine;
	}
	
	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("You inserted a quarter");
		gumBallMachine.setState(gumBallMachine.getHasQuaterState());
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("You haven't inserted a quarter");
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("You turned, but there's no quarter");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("You need to pay first");
	}

}