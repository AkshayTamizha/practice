package com.practise;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HasLinset {

	public static void main(String[] args) {
		
		
		Set<Integer> ex = new HashSet<Integer>();
		
		ex.add(10);
		ex.add(20);
		ex.add(30);
		ex.add(40);
		ex.add(50);
		ex.add(50); // remove duplicate value
		//ex.add(null); // allow one null value
		
		System.out.println(ex);  // hash set random order
		for(int x1 : ex) {
			System.out.println(x1);
		}
		
		
		Set<Integer> ex2 = new LinkedHashSet<Integer>();
		
		ex2.add(11);
		ex2.add(21);
		ex2.add(33);
		ex2.add(21);  // remove duplicate
		ex2.add(null); // accept only one null
			
		System.out.println(ex2);   // prints in insertion order
		
		Set<Integer> ex3 = new TreeSet<Integer>();
		ex3.add(5);
		ex3.add(6);
		ex3.add(7);
		ex3.add(8);
		ex3.add(7);  // remove duplicate
		// ex3.add(null); tree set doesnt allow null-  
		
		System.out.println(ex3);  // prints in ascending order
		// normall forloop does not work because it not index based it is value based
		
		
		Set<String> ex4 = new TreeSet<String>();
		
		ex4.add("rmba kuttty");
		ex4.add("kutty");
		ex4.add("Akshay");
		
		
		System.out.println(ex4);  // ascending order based on ascii value
		
		
		
		
		
		
		
	}
	
	
}
