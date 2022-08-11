package com.practise;

public class Program2 {
	
	public static void main(String[] args) {
		
		int emp =20;
		
	if( emp==20) { // if statemnt
		System.out.println("Akshay");
	}else
	{
		System.out.println("kutty");
	}
	
		for(int i =1; i<=5;i++) {  //for statement
			System.out.println(i);
		}
		System.out.println("end");
		
		for(int i =1;i <=5;i++) {   // for inner loop
			for(int j =1;j <=6;j++){
				
				System.out.print(i);
				
			}
			System.out.println();
			
		}
		
		for( int i =1;i<=10;i++) {
			
			if(i==5) {
				break; // print till 4 and go out of loop
				
			}
			System.out.println(i);
		}
	}
	

}
