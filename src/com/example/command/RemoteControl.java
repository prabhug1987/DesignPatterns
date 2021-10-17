package com.example.command;

public class RemoteControl {
	Command onCommands[];
	Command offCommands[];
    Command undoCommand;
    
	public RemoteControl() {
		// TODO Auto-generated constructor stub

		onCommands = new Command[7];
		offCommands = new Command[7];

		Command noCommand = new NoCommand();

		for (int i = 0; i < offCommands.length; i++) {
			offCommands[i] = noCommand;
			onCommands[i] = noCommand;
		}
		
		undoCommand = noCommand;

	}

	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	 }

	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
		undoCommand = onCommands[slot];
	}

	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}
	
	public void undoButtonWasPressed() {
		// TODO Auto-generated method stub
		undoCommand.undo();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("\n----- Remote Control ------ \n");

		for (int i = 0; i < offCommands.length; i++) {
			stringBuffer.append(
					"[slot " + i + "]" + onCommands[i].getClass().getName() + "  " + offCommands.getClass().getName()+"\n");
		}
		
		stringBuffer.append("[undo]"+undoCommand.getClass().getName()+"\n");
		

		return stringBuffer.toString();
	}

}
