package com.farouk.bengharssallah.java.remote.ws.soap.client;

import java.rmi.RemoteException;

import com.farouk.bengharssallah.java.remote.ws.soap.service.SoapWSProxy;


public class SoapWSClient {
	
				
	
	             public static void main(String[] args) {
					     
	            	  try {     
	            	                    // a proxy class is generated by JAX-WS, with all the used classes
	            		               // in soap.service, you don't have to write them, just provide the WSDL file URL
	            		         SoapWSProxy proxy = new SoapWSProxy();
	            		         System.out.println("SopaWS response is : " + proxy.getMessage() );
	            		         System.out.println("");
	            		         System.out.println("SopaWS response is : " + proxy.getMessageByName("TUTORAIL"));
	            	         
	            	        
	            	         
	            	                   }
	            	  catch (RemoteException e){
	            		  
	            		                    e.printStackTrace();
	            	                   }
	            	 
				          }

}
