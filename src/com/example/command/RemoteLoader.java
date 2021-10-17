package com.example.command;

public class RemoteLoader {
	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();
		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		GarageDoor garageDoor = new GarageDoor("");
		Stereo stereo = new Stereo();
		TV tv = new TV("Living Room");
		Hottub hottup = new Hottub("");
		
		LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);
		
		LightOnCommand kitchenLightOnCommand = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOffCommand = new LightOffCommand(kitchenLight);
		
		CeilingFanOnCommand ceilingFanOnCommand = new CeilingFanOnCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
		
		GarageDoorUpCommand garageDoorUpCommand = new GarageDoorUpCommand(garageDoor);
		GarageDoorDownCommand garageDoorDownCommand = new GarageDoorDownCommand(garageDoor);
		
		StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
		StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
		
		TVOnCommand tvOnCommand = new TVOnCommand(tv);
		HottubOnCommand hottubOnCommand = new HottubOnCommand(hottup);
		TVOffCommand tvOffCommand = new TVOffCommand(tv);
		HottubOffCommand hottubOffCommand = new HottubOffCommand(hottup);
		
		Command partyOn[] = {livingRoomLightOnCommand,stereoOnWithCDCommand,tvOnCommand,hottubOnCommand};
		Command partyOff[] = {livingRoomLightOffCommand,stereoOffCommand,tvOffCommand,hottubOffCommand};
				
		MacroCommand partyOnMacro = new MacroCommand(partyOn);
		MacroCommand partyOffMacro = new MacroCommand(partyOff);
		
		remoteControl.setCommand(0, livingRoomLightOnCommand, livingRoomLightOffCommand);
		remoteControl.setCommand(1, kitchenLightOnCommand, kitchenLightOffCommand);
		remoteControl.setCommand(2, ceilingFanOnCommand, ceilingFanOffCommand);
		remoteControl.setCommand(3, garageDoorUpCommand, garageDoorDownCommand);
		remoteControl.setCommand(4, partyOnMacro, partyOffMacro);
		
		System.out.println(remoteControl);
		
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		System.out.println(remoteControl);		
		remoteControl.undoButtonWasPressed();
		
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);
		remoteControl.undoButtonWasPressed();
		
		remoteControl.onButtonWasPushed(3);
		remoteControl.offButtonWasPushed(3);
		remoteControl.undoButtonWasPressed();
		System.out.println(remoteControl);
		System.out.println("Pushing macro on-----");
		remoteControl.onButtonWasPushed(4);
		System.out.println("Pushing macro off-----");
		remoteControl.offButtonWasPushed(4);
		remoteControl.undoButtonWasPressed();
		
		
	}

}
