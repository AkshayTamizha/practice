package com.practise;

public class String_Methods {

	public static void main(String[] args) {
			
	String s1= "Hello World";
	String r = s1.replace("World", "Java");
	System.out.println(r);
	
	String s2 = "This is manual testing";
		
	String rr =s2.replace("manual", "Automation");
	System.out.println(rr);

	Boolean b3= s2.startsWith("This");
	System.out.println(b3);
	
	Boolean b4=s2.endsWith("is");
	System.out.println(b4);
	
	String s3 = "";
	Boolean b=s3.isEmpty();
	System.out.println(b);
	
	String s4=" "; // because it has space betweem double quotes
	Boolean b1=s4.isEmpty();
	System.out.println(b1);
	
	
	
	
	
	
	
}
}