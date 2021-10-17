package com.example.command;

public class TVOffCommand implements Command{

	private TV tv;
	
	public TVOffCommand(TV tv) {
		// TODO Auto-generated constructor stub
		this.tv = tv;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		tv.off();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		tv.on();
	}
	
}
