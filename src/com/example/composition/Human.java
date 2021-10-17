package com.example.composition;

public class Human {
// human owns all the body parts
	// all destroyed if he/she dies
	public Human() {
		head head = new head();
		Leg l = new Leg();
		
		Heart h = new Heart();
		Hand hand = new Hand();
	}

}
