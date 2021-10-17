package com.example.coupling.loose;

public class Test {
	
	public static void main(String[] args) {
		IWorker sw = new SmartWorker();
		sw = new LazyWorker();
		
		Manager mn = new Manager(sw);
		mn.manageWork();
		
		
		sw = new LazyWorker();
		
		mn = new Manager(sw);
		mn.manageWork();
		
		sw = new ExtraordinaryWorker();
		mn = new Manager(sw);
		mn.manageWork();
	}

}
