package com.practise;

public class MutableImmutableString {

	public static void main(String[] args) {
		
	
	String s1 = "Venkat";
	String s2="Prabu";
	
	System.out.println("Immutable String");
	
	System.out.println(System.identityHashCode(s1));
System.out.println(System.identityHashCode(s2));

String s=s1.concat(s2);
System.out.println(s);
System.out.println(System.identityHashCode(s));  // it will add adding new memory

System.out.println("************");

System.out.println("Mutable String");

StringBuffer x1 = new StringBuffer("Venkat");
System.out.println(System.identityHashCode(x1));

StringBuffer x2= new StringBuffer("Prabhu");
System.out.println(System.identityHashCode(x2));

StringBuffer x3=x1.append(x2);
System.out.println(System.identityHashCode(x3));





	}
}
