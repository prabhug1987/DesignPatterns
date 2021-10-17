package com.learning.state;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GumballMachineRemote extends Remote {
	public int getCount() throws RemoteException;

	public int getLocation() throws RemoteException;

	public State getState() throws RemoteException;

}
