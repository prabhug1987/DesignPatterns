package com.pattern.frontcontroller;

public class FrontControllerDemo {

	public static void main(String[] args) {
		StudentView studentView = new StudentView();
		HomeView homeView = new HomeView();
		Dispatcher dispatcher = new Dispatcher(studentView,homeView);
		FrontController frontController = new FrontController(dispatcher);
		
		frontController.dispatchRequest("HOME");
		frontController.dispatchRequest("STUDENT");
		
		
	}
}
