package com.example.command;

public class CeilingFanOnCommand implements Command{

	private CeilingFan ceilingFan;
	
	public CeilingFanOnCommand(CeilingFan ceilingFan) {
		// TODO Auto-generated constructor stub
		this.ceilingFan = ceilingFan;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.ceilingFan.on();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		ceilingFan.off();
	}

}
