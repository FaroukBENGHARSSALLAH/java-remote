package com.farouk.bengharssallah.java.remote.ws.soap.server;

import javax.xml.ws.Endpoint;

import com.farouk.bengharssallah.java.remote.ws.soap.service.SoapWS;

public class SoapWSServer {

	      public static void main(String[] args) {
	    	    System.out.println("            SOAP WS SERVER is running              ");
			    String urlPath = "http://localhost:8585/";
			    Endpoint.publish(urlPath, new SoapWS());
		  }
}
