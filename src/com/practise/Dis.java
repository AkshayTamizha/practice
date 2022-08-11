package com.practise;

public class Dis extends Dis1{
	
	/*int id = 100; 
	
	public  void num() {
		int id = 10;
		System.out.println(id);  // if we call method it will take the variable inside that method first
	}
	
	public static void main(String[] args) {
		
		Dis a = new Dis();
		a.num();*/
		
		
   int id = 100; 
	
	public  void num() {
		int id = 10;
		System.out.println();
		System.out.println(super.id); // it will take from parent class
		System.out.println(this.id);  // if we call this it will take this id num
	}
	public static void main(String[] args) {
		
		Dis a = new Dis();
		a.num();
		
		
	}

}
