package com.learning.state;

import java.rmi.Naming;

public class GumballMachineTest {
	public static void main(String[] args) {
		GumBallMachine gumBallMachine = null;
		int count;

		if (args.length < 2) {
			System.out.println("Gumball machine <name> <inventory>");
			System.exit(0);
		}

		try {
			count = Integer.parseInt(args[1]);
			gumBallMachine = new GumBallMachine(args[0], count);
			Naming.rebind("//" + args[0] + "/gumballmachine", gumBallMachine);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
}
