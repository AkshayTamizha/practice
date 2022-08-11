package com.practise;

public class Exception_Handling {

	public static void main(String[] args) {
		
		
		System.out.println("start");
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		try {
		System.out.println(10/0); 
		}
		catch(NullPointerException e) {  // we can give one catch with same exception
			System.out.println("dont print 10/0");
		}
		
		/*
		 * catch(ArithmeticException e) // another catch we can give {
		 * System.out.println("dont print 10/0"); }
		 */
		
		catch(Throwable e) {   // instead of arithmetic exception we can use throwable 
			System.out.println("dont print 10/0");
		}
		finally { // we can give exception like try, catch, finally we cant reverse or interchange the order
			System.out.println("print finally");  //finally will execute whether the exception happen or not
		}
		System.out.println("4");
		System.out.println("5");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
