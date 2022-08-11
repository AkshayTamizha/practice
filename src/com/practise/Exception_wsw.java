package com.practise;

import java.io.IOException;

public class Exception_wsw {

	public static void main(String[] args) throws InterruptedException, ArithmeticException, IOException {
		
		info();		
	}
	
	 private static void info() throws IOException {
	 
	  System.out.println("hello");
	  throw new IOException();
	 
	 }	
}
	

