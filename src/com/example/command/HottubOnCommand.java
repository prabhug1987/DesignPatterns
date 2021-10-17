package com.example.command;

public class HottubOnCommand implements Command{

	private Hottub hottub;
	
	public HottubOnCommand(Hottub hottub) {
		// TODO Auto-generated constructor stub
		this.hottub = hottub;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		hottub.off();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		hottub.on();
	}
	
}
