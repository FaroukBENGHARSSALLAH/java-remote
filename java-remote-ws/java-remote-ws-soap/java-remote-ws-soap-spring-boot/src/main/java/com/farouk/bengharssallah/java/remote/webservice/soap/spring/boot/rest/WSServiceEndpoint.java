package com.farouk.bengharssallah.java.remote.webservice.soap.spring.boot.rest;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.springframework.stereotype.Component;

@WebService
@Component
public class WSServiceEndpoint {

     @WebMethod()
	public String message(@WebParam(name = "name") String name) {
		    return "Welcome " + name;
	}

}
