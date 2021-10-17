package com.example.coupling;

public class Test {
	
	public static void main(String[] args) {
		SmartWorker sw = new SmartWorker();
		LazyWorker lw = new LazyWorker();
		
		Manager mn = new Manager(sw,lw);
		mn.manageWork();
	}

}
