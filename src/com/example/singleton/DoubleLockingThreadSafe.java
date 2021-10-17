package com.example.singleton;

public class DoubleLockingThreadSafe {

	private static DoubleLockingThreadSafe instance;

	private DoubleLockingThreadSafe() {

	}

	public DoubleLockingThreadSafe getInstance() {

		if (instance == null) {
			synchronized (DoubleLockingThreadSafe.class) {
				if (instance == null) {
					instance = new DoubleLockingThreadSafe();
				}
			}
		}
		return instance;
	}
}
