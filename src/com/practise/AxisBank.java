package com.practise;

public class AxisBank implements Bank {

	@Override
	public void savings() {
		
		System.out.println("savings");
		
	}

	@Override
	public void current() {
		// TODO Auto-generated method stub
		System.out.println("current");
	}

	@Override
	public void joint() {
		// TODO Auto-generated method stub
		System.out.println("joint");
	}

	public static void main(String[] args) {
		
		
		AxisBank a = new AxisBank();
		a.savings();
		a.current();
		a.joint();
		
		
	}
	
	
	
}
