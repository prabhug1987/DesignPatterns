package com.pattern.frontcontroller;

public class FrontController {

	Dispatcher dispatcher;
	
	public FrontController(Dispatcher dispatcher) {
		// TODO Auto-generated constructor stub
		
		this.dispatcher = dispatcher;
	}
	
	private boolean isAuthenticUser() {
		// TODO Auto-generated method stub
		System.out.println("User is authenticated successfully");
		return true;
	}
	
	private void trackRequest(String request) {
		System.out.println("Page requested is "+request);
	}
	
	public void dispatchRequest(String request) {
		trackRequest(request);
		
		if(isAuthenticUser()) {
			dispatcher.dispatch(request);
		}
	}
	
	
}
