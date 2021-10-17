package com.example.command;

public class CeilingFanOffCommand implements Command{

	private CeilingFan ceilingFan;
	
	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		// TODO Auto-generated constructor stub
		this.ceilingFan = ceilingFan;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		ceilingFan.off();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		System.out.println("undoing ceiling fan");
		ceilingFan.on();
	}

}
