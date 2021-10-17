package com.learning.state;

import java.rmi.Naming;

public class GumballMonitorTest {

	public static void main(String[] args) {
		String[] locations = { "rmi://santafe.mightygumball.com/gumballmachine",
				"rmi://boulder.mightygumball.com/gumballmachine", "rmi://seattle.mightygumball.com/gumballmachine" };
		GumballMonitor[] monitors = new GumballMonitor[locations.length];

		for (int i = 0; i < locations.length; i++) {
			try {
				GumBallMachine machine = (GumBallMachine) Naming.lookup(locations[i]);
				monitors[i] = new GumballMonitor(machine);
				System.out.println(monitors[i]);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
		for (int i = 0; i < monitors.length; i++) {
			monitors[i].report();
		}
	}
}
