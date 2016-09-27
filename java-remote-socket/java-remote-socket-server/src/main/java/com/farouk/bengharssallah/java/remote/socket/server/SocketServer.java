package com.farouk.bengharssallah.java.remote.socket.server;

import java.net.ServerSocket;
import java.net.Socket;

import com.farouk.bengharssallah.java.remote.socket.service.ServiceClient;

public class SocketServer extends Thread {
	
	    private int clientNumber;
	    
	    public static void main(String[] args) {
                             SocketServer socketServer = new SocketServer();
                             socketServer.start();
                          }
	
	        @Override
	    public void run(){
	        	      try{
	        	    	    ServerSocket serverSocket = new ServerSocket(1055);
	        	    	    System.out.println(" ");
	        	    	    System.out.println("          Deploying Server Socket on IPAddress  'localhost:1055'           ");
	        	    	    System.out.println(" ");
	        	    	    while(true){
	        	    	    	     Socket socket = serverSocket.accept();
	        	    	    	     clientNumber++;
	        	    	    	     ServiceClient service = new ServiceClient(socket, clientNumber);
	        	    	    	     service.start();
	        	    	    	     
	        	    	                  }
	        	                 }
	        	      catch(Exception e){
	        	    	             e.printStackTrace();
	        	                 }
	        	      
	        }
	 
	
	    

}
