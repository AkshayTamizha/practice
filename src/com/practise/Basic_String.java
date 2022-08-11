package com.practise;

public class Basic_String {

	public static void main(String[] args) {
		
		String s1 = "Akshay";
		System.out.println(s1);
		
	int id =	s1.indexOf("h");
	System.out.println(id);
	
	int id1 =s1.indexOf("a");  //if we have 2 same letter with case sensitive it will take first one
		System.out.println(id1);
		
		// if its last index of "a" means it takes last one
		
		char c=s1.charAt(3);
		System.out.println(c);
		
		Boolean b= s1.equals("Akshay");
		System.out.println(b);
		
		Boolean b1=s1.equalsIgnoreCase("akshay"); // ignores case sensitive
	System.out.println(b1);
	
	 String ss =s1.substring(2);
	System.out.println(ss);
	
	String ss2=s1.substring(2, 5);
	System.out.println(ss2); 
	
	
	String s2 = "Welcome to java";
	
	System.out.println(s2);
	
	String up=s2.toUpperCase();
 System.out.println(up);
 
 String lo= s2.toLowerCase();
 System.out.println(lo);
 
		 Boolean s= s2.contains("Welcome"); System.out.println(s);
		 
	
	String [] sp =s2.split(" ");
	
	for( int i=0; i<sp.length;i++) {
		System.out.println(sp[i]);
		
	}
	System.out.println(sp);
	System.out.println(s2.length());
	System.out.println(sp.length);
	
}}
