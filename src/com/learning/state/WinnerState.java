package com.learning.state;

public class WinnerState implements State {

	GumBallMachine gumBallMachine;
	
	public WinnerState(GumBallMachine gumBallMachine) {
		// TODO Auto-generated constructor stub
		this.gumBallMachine = gumBallMachine;
	}
	
	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("You cant insert a quarter");
		gumBallMachine.setState(gumBallMachine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("You haven't inserted a quarter");
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("You cant turn twice");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("You are a winner! you get two gumballs for your quarter");
		gumBallMachine.releaseBall();
		
		if(gumBallMachine.getCount() == 0 ) {
			gumBallMachine.setState(gumBallMachine.soldOutState);
		}else {
			gumBallMachine.releaseBall();
			if(gumBallMachine.getCount() > 0 ) {
				gumBallMachine.setState(gumBallMachine.getNoQuarterState());
			}else {
				System.out.println("Ooops, out of gumballs !");
				gumBallMachine.setState(gumBallMachine.getSoldOutState());
			}
			
		}
		
	}

}
