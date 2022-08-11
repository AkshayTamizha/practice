package com.practise;

public class Exception_Handling1 {

	public static void main(String[] args) {
		
		System.out.println("start");
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		try {
		System.out.println(10/0);  // from here directly goes to arithmetic exception catch block 
		                // and it goes to finally block and program end dont come reverse
		// if inside try 10/2 possible it goes to further try catch and execute
		try {
			String s = null;
			System.out.println(s.charAt(0));
		}
		catch(NullPointerException e) {
			System.out.println("inner finally");
		} finally
		{
			System.out.println("inner print final");
		}
		}catch (ArithmeticException e) {
			System.out.println(" dont by zero");
		}
		finally {
			System.out.println("outer finally");
		}
		
		System.out.println("4");
		System.out.println("5");
		System.out.println("end");
		
		
		
		
		
		
		
		
		
	}
	
}
