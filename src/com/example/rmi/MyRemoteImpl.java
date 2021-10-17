package com.example.rmi;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

	/**
	 * 
	 */	
	private static final long serialVersionUID = 1L;

	protected MyRemoteImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String sayHello() throws RemoteException {
		// TODO Auto-generated method stub
		return "server says hey";
	}

	public static void main(String[] args) {
		try {
			MyRemoteImpl service = new MyRemoteImpl();
			Naming.rebind("RemoteHello", service);
			System.out.println("Server is ready");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
