package com.example.state;

public class StatePatternDemo {
	
	public static void main(String[] args) {
		Context context = new Context();
		
		StartState startState = new StartState();
		
		startState.doAction(context);
		
		System.out.println(""+ context.getState());
		
		StopState endState = new StopState();
		endState.doAction(context);
		
	}

}
