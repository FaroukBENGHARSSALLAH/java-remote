package com.farouk.bengharssallah.java.remote.ws.rest.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


		  //  @Path annotation means that the class 
		 //  provide some restful webservice methods accessible
        //   via the specified path.
@Path("/restWS")
public class RestWSService {
	
				
				 // @GET annotation means that the method will be called on a HTTP GET
	            //  @Path annotation means that the method will be called by the the specified path
	           //   @Produces annotation means that the method will return a HTTP response with the specified type 
			@GET
			@Path("/msg")
			@Produces(MediaType.TEXT_HTML)
			public String getABCTopStories(){
	                          return "<br /><br />&nbsp;&nbsp;&nbsp;&nbsp;<h4> &nbsp;&nbsp;&nbsp;&nbsp;Welcome to the rest WebService project &nbsp;&nbsp;&nbsp;&nbsp;</h4> <br />";
			            }
			
			
			
			
			   // @GET annotation means that the method will be called on a HTTP GET
              //  @Path annotation means that the method will be called by the the specified path
             //   @Produces annotation means that the method will return a HTTP response with the specified type 
			//    @PathParam annotation means that an input parameter with the specified name 
		   //           will be provided to the method during when it's called 
			
			@GET
			@Path("/msgbyname/{name}")
			@Produces(MediaType.TEXT_HTML)
			public String getNewsByURL(@PathParam("name")String name){
				                return "<br /><br />&nbsp;&nbsp;&nbsp;&nbsp;<h4> &nbsp;&nbsp;&nbsp;&nbsp;Welcome " + name + " to the rest WebService project &nbsp;&nbsp;&nbsp;&nbsp;</h4> <br />";
					}

   }