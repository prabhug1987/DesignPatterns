package com.example.facade;

public class HomeTheaterFacade {
	Amplifier amplifier;
	Tuner tuner;
	DvdPlayer dvdPlayer;
	CdPlayer cdPlayer;
	Projector projector;
	Screen screen;
	PopcornPopper popper;
	TheaterLights lights;

	public HomeTheaterFacade(Amplifier amplifier, Tuner tuner, DvdPlayer dvd, CdPlayer cdPlayer, Projector projector,
			Screen screen, TheaterLights lights, PopcornPopper popper) {
		// TODO Auto-generated constructor stub
		this.amplifier = amplifier;
		this.tuner = tuner;
		this.dvdPlayer = dvd;
		this.cdPlayer = cdPlayer;
		this.projector = projector;
		this.screen = screen;
		this.lights = lights;
		this.popper = popper;

	}

	public void watchMovie(String movie) {
		// TODO Auto-generated method stub

		System.out.println("Get ready to watch a movie");
		popper.on();
		popper.pop();
		lights.dim(10);
		screen.down();

		projector.on();
		projector.wideScreenMode();

		amplifier.on();
		amplifier.setDvdPlayer(dvdPlayer);
		amplifier.setSurroundSound();
		amplifier.setVolume();

		dvdPlayer.on();
		
		dvdPlayer.play(movie);

	}

	public void endMovie() {
		System.out.println("Shutting movie theater down....");
		popper.off();
		lights.off();
		amplifier.off();
		screen.up();
		projector.off();

		amplifier.off();
		dvdPlayer.stop();
		dvdPlayer.eject();

		dvdPlayer.stop();

	}

}
