package com.farouk.bengharssallah.java.remote.rmi.server.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMIServiceRmote extends Remote  {
	
	           public String getMessage() throws RemoteException ;
	           
	           public String getMessageByName(String name) throws RemoteException ;

          }
