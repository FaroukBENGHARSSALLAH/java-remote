package com.farouk.bengharssallah.java.remote.rmi.server;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import com.farouk.bengharssallah.java.remote.rmi.server.service.RMIServiceRmote;
import com.farouk.bengharssallah.java.remote.rmi.server.service.implementation.RMIServiceRmoteImplementation;

public class RMIServer {
	
	
	                    public static void main(String[] args) {
	                    	
							                 try {
												                	  // A RMI JAVA API need two things, IP address and a port, by which it 
												                     // can receive clients requests
							                	             // RMI Port
							                	         LocateRegistry.createRegistry(1099); 
														 RMIServiceRmote service = new RMIServiceRmoteImplementation();
														                 // RMI @, and target Class; 'RMIServiceRmote' to be accessible for executing
										                 Naming.rebind("rmi://localhost:1099/RMIService", service);   
										                 System.out.println("  " + service.toString() + " is deployed and ready for service ");
											                } 
							                 catch (Exception e) {
												         e.printStackTrace();
											                }
							                 
						                  }

                    }
