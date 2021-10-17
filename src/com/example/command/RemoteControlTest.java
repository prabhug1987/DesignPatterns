package com.example.command;

public class RemoteControlTest {

	public static void main(String[] args) {
		SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
		Light light = new Light("light");
		LightOnCommand lightOnCommand =new LightOnCommand(light);
		simpleRemoteControl.setCommand(lightOnCommand);
		simpleRemoteControl.buttonWasPressed();
		
		GarageDoor garageDoor = new GarageDoor("");
		GarageDoorUpCommand garageDoorOpenCommand = new GarageDoorUpCommand(garageDoor);
		
		simpleRemoteControl.setCommand(garageDoorOpenCommand);
		simpleRemoteControl.buttonWasPressed();
		
	}
}
