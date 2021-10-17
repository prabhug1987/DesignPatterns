package com.example.command;

public class SimpleRemoteControl {

	Command slot;
	
    public SimpleRemoteControl() {
		// TODO Auto-generated constructor stub
	}
    
    public void setCommand(Command command) {
    	this.slot = command;
    }
    
    public void buttonWasPressed() {
    	slot.execute();
    }
    
}
