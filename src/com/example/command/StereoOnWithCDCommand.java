package com.example.command;

public class StereoOnWithCDCommand implements Command{

	private Stereo stereo;
	
	public StereoOnWithCDCommand(Stereo stereo) {
		// TODO Auto-generated constructor stub
		this.stereo = stereo;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		stereo.on();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		stereo.off();
	}
	
}
