package com.example.coupling.loose;

public class Manager {
	IWorker iw;
	
	
	public Manager(IWorker iw) {
		this.iw = iw;
	}
	
	public void manageWork() {
		iw.work();
	}
	

}
