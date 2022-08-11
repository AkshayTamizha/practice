package com.practise;

import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {
		
		System.out.println("start");
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		//System.out.println(null);
		//System.out.println(10/0);  // arithmetic exception
	                                // exception like error the program will teminate on line itself
		System.out.println("4");
		System.out.println("5");
		
		//String s = null;
		//System.out.println(s.length());  // null point exception
		
		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("enter the text");
		 * int a=sc.nextInt(); // input mismatch exception System.out.println(a)
		 */; 
		
		
		/*
		 * int num[]= new int[4]; // array index out of bond exception
		 * System.out.println(num[5]);
		 */
		
		/*
		 * String s = "Akshay"; // string index out of bond exception s.charAt(8);
		 */
		
		
		String s1= "1234";
		System.out.println(s1+5);
		
		int i=Integer.parseInt(s1);
		System.out.println(i+5);
		
		String s2 ="abc12345";            
		System.out.println(s2+5);
		
		int i2=Integer.parseInt(s2);  // number format exception 
		System.out.println(i2+5);
		
		
		
		
		
	}
	
	
}
