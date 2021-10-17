package com.pattern.frontcontroller;

public class Dispatcher {

	StudentView studentView;
	HomeView homeView;
	
	public Dispatcher(StudentView studentView, HomeView homeView) {
		// TODO Auto-generated constructor stub
		this.studentView = studentView;
		this.homeView = homeView;
	}
	
	public void dispatch(String request) {
		if(request.equalsIgnoreCase("Student")) {
			studentView.show();
		}
		else {
			homeView.show();
		}
	}
	
}
