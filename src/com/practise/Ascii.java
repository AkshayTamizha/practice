package com.practise;

public class Ascii {

	public static void main(String[] args) {
		
	char ch ='a';
	int v =ch;  // to find out the value of ascii
	System.out.println(v);
	
	String s = "A";
     int c=	s.compareTo("B");  // IT WILL MINUS VALUE FROM A and five out for single char
	System.out.println(c);
	
	String s2="ABCD";
int cc=	s2.compareTo("ABFK"); // if we minus with multiple charac it minu8s fom first char
	System.out.println(cc);
	int c2 =s2.compareTo("AB");
	System.out.println(c2);  // if it with diff length and same accuration it print length
	}
}
