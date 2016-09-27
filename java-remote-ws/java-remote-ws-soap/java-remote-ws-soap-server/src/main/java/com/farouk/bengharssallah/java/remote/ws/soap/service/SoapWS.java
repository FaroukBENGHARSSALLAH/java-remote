package com.farouk.bengharssallah.java.remote.ws.soap.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;


         // @WebService annotation is registered within JAX-WS in JDK6. 
        //It means that this class publish some webservices.

@WebService(serviceName = "sopaWS")
public class SoapWS {
	
	
					// @WebMethod annotation means that the method 
	                // a webservice method.
	
	        @WebMethod(operationName = "getMessage")
	     public String getMessage(){
	        	             return "Welcome to a SOAP WebService Project";
	                    }
	        

			     // @WebParam annotation means that the considered 
		            // should be passed to the webservice method.
	        
	          @WebMethod(operationName = "getMessageByName")
		public String getMessageByName( @WebParam(name = "name") String name){
	        	               return "Welcome " + name + " to a SOAP WebService Project";
			             }
	        
  }