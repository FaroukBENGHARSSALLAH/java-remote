package com.farouk.bengharssallah.java.remote.socket.service;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketAddress;

public class ServiceClient extends Thread {
	
	    private Socket clientSocket;
	    private int number;
	    private SocketAddress ipAddress;

		public ServiceClient(Socket clientSocket, int number) {
						this.clientSocket = clientSocket;
						this.number= number;
		            }
		
	     
		      @Override
		    public void run() {
		    	  
		    	         try{
		    	        	 
		    	                        // API to read sent String from client Socket 
				    	          InputStream inputStream = clientSocket.getInputStream();
				    	          InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
				    	          BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
				    	          
				    	                  // API to send String to client Socket 
				    	          OutputStream outputStream = clientSocket.getOutputStream();
				    	          PrintWriter printWriter = new PrintWriter(outputStream, true);
				    	          
				    	                  // Get Client IP Address
				    	          ipAddress = clientSocket.getRemoteSocketAddress();
				    	          
				    	          System.out.println(" ");
				    	          System.out.println(" & Established connexion from client with number " + number + " and with IP" + ipAddress);
				                  printWriter.println(" & You are the client number " + number);  
				                  System.out.println(" ");
				                  while(true){
				                	               String sentString = bufferedReader.readLine();
				                	               System.out.println("client with number " + number + " have sent " + sentString);
				                	               printWriter.println(" You have sent " + sentString);
				                	  
				                                      } 
		    	                            }
		    	         catch(Exception e){
		    	        	 
		    	                            }
		    	          
		            }
      
     }