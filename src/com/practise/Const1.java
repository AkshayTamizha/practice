package com.practise;

public class Const1 {

	public Const1() {
		this(24);
		System.out.println("i am constructor");
		
	}
	
	public Const1(int a) {
		this(23.44f);
System.out.println(" i am argument");
	}
	
	public Const1(float f) {
		
		System.out.println("this is float");
	}
	
	/*
	 * public void Const(int i) { System.out.println(i); }
	 */
	
	public static void main(String[] args) {
		
		Const1 s1 = new Const1();
		//Const1 s2 = new Const1(2345);
		//s1.Const(23);
	}
	
}
