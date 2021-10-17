package com.example.command;

public class GarageDoorUpCommand implements Command {

	GarageDoor garageDoor;
	
	public GarageDoorUpCommand(GarageDoor garageDoor) {
		// TODO Auto-generated constructor stub
		this.garageDoor = garageDoor;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		//System.out.println("Executing Garage door open command");
		garageDoor.up();
	}
	@Override
	public void undo() {
		// TODO Auto-generated method stub
		garageDoor.down();
	}

}
