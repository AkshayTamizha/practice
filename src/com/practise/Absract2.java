package com.practise;

public class Absract2 extends Abstract_Class {

	@Override
	void savings() {
System.out.println("savings regular");		
	}

	@Override
	void current() {
		System.out.println("current");
		
	}

	@Override
	void joint() {
		System.out.println("joint");
		
	}

	public static void main(String[] args) {
		
	
	Absract2 ab = new Absract2();	
	ab.savings();
	ab.current();
	ab.joint();
}
}