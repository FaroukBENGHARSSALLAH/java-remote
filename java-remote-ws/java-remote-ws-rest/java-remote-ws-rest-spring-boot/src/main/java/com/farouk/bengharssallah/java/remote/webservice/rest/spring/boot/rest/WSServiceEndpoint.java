package com.farouk.bengharssallah.java.remote.webservice.rest.spring.boot.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

@Path("/api")
@Component
public class WSServiceEndpoint {

     @GET
     @Path("/message/{name}")
     @Produces(MediaType.APPLICATION_JSON)
	public String message(@PathParam(value = "name") String name) {
		    return "Welcome " + name;
	}

}
