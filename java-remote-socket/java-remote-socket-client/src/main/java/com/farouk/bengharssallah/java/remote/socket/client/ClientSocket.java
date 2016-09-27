package com.farouk.bengharssallah.java.remote.socket.client;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientSocket {

	           public static void main(String[] args) {
						                try{
						                	           Socket socket = new Socket("localhost", 1055);
						                	           
						                	                    // API to read sent String from Server Socket 
										    	       InputStream inputStream = socket.getInputStream();
										    	       InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
										    	       BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
										    	          
										    	               // API to send String to Server Socket 
										    	       OutputStream outputStream = socket.getOutputStream();
										    	       PrintWriter printWriter = new PrintWriter(outputStream, true);
										    	      
										    	       String welcomeString = bufferedReader.readLine();
					                	               System.out.println("Server Socket have sent " + welcomeString);
										    	       while(true){
													    	    	      
										    	    	                  Scanner keyboard = new Scanner(System.in);
										    	    	                  System.out.print("Donner un entier : ");
										    	    	                  int x = keyboard.nextInt();
										    	    	                  printWriter.println("I enter " + x);
										    	    	                  String sentString = bufferedReader.readLine();
											    	    	              System.out.println("Server Socket have sent " + sentString);
										    	    	                  
										    	                                 }
						    	    	              
						                                             }
						                catch(Exception e){
						                	            e.printStackTrace();
						                            }
			           }
	           
}
