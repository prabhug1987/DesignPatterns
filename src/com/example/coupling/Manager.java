package com.example.coupling;

public class Manager {
	SmartWorker sw;
	LazyWorker lw;
	ExtraordinaryWorker eow;
	
	public Manager(SmartWorker sw, LazyWorker lw,ExtraordinaryWorker eow) {
		this.sw = sw;
		this.lw = lw;
		this.eow = eow;
	}
	
	public void manageWork() {
		sw.work();
		lw.work();
	}
	

}
