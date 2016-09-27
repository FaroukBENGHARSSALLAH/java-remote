package com.farouk.bengharssallah.java.remote.rmi.server.service.implementation;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import com.farouk.bengharssallah.java.remote.rmi.server.service.RMIServiceRmote;

@SuppressWarnings("serial")
public class RMIServiceRmoteImplementation extends UnicastRemoteObject implements RMIServiceRmote {

	public RMIServiceRmoteImplementation() throws RemoteException {
		super();
	    }

	public String getMessage() throws RemoteException {
		             return "Welcome to a Java RMI Project";
	         }

	public String getMessageByName(String name) throws RemoteException {
		             return "Welcome " + name + " to a Java RMI Project";
	         }

}
