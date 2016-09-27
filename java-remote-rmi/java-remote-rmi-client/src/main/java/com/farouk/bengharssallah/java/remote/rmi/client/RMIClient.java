package com.farouk.bengharssallah.java.remote.rmi.client;

import java.rmi.Naming;

import com.farouk.bengharssallah.java.remote.rmi.server.service.RMIServiceRmote;

public class RMIClient {

		public static void main(String[] args) {
			
	                 try {
								                	 // A RMI JAVA Client API need the Server @ where it can send requests
	                	 
	                	               // you should put the Service Interface 'RMIServiceRmote' in client directory with the same package name 
						            RMIServiceRmote stub = (RMIServiceRmote) Naming.lookup("rmi://localhost:1099/RMIService");
						            System.out.println("RMI Server Response " + stub.getMessage());
						            System.out.println("");
						            System.out.println("RMI Server Response " + stub.getMessageByName("tutorial"));
						            
					                       } 
	                 catch  (Exception e) {
						            e.printStackTrace();
					                       }
	                 
		            }

}
