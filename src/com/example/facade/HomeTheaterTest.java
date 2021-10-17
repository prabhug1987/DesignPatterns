package com.example.facade;

public class HomeTheaterTest {

	public static void main(String[] args) {
		Amplifier amplifier = new Amplifier();
		Tuner tuner = new Tuner(amplifier);
		DvdPlayer dvdPlayer = new DvdPlayer(amplifier);
		CdPlayer cdPlayer = new CdPlayer(amplifier);
		Projector projector = new Projector();
		Screen screen = new Screen();
		TheaterLights lights = new TheaterLights();
		PopcornPopper popper = new PopcornPopper();
		
		
		HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amplifier, tuner, dvdPlayer, cdPlayer, projector, screen, lights, popper)
				
		homeTheaterFacade.watchMovie("Lord of the Rings");
		
		homeTheaterFacade.endMovie();
	}
}
