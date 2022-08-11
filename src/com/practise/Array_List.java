package com.practise;

import java.util.ArrayList;
import java.util.List;

import javax.print.DocFlavor.CHAR_ARRAY;

public class Array_List {

	// List li = new ArrayList();
	
	public static void main(String[] args) {
		
		List ex = new ArrayList();
		ex.add("Akshay");
		ex.add(10);
		ex.add(982729373l);
		ex.add(234.444f);
		ex.add(25);
		  
		System.out.println(ex);
		
		List<Integer> li = new ArrayList<Integer>();
		li.add(25);
		li.add(10);
		li.add(50);
		li.add(100);
		li.add(25);
		
		System.out.println(li);
		
		int size =li.size();
		System.out.println(size);  // based on length
		
		
		int get=li.get(3);
		System.out.println(get);  // based on index
		
		
		
		  for(int i=0;i<li.size();i++)
		  { System.out.println(li.get(i));
		  }
		 
		
		
		  for(Integer a:li)
		  {
			  System.out.println(a);
			  }
		
		
		int c=li.remove(3);
		System.out.println(c);
		System.out.println(li);
		
		li.add(2, 100);
		System.out.println(li);
		
		li.set(2, 97);
		System.out.println(li);
		
		boolean ab=li.contains(50);
		System.out.println(ab);
		
		/*
		 * li.clear(); System.out.println(li);
		 */
		int n=li.indexOf(97);
		System.out.println(n);
		
		ex.addAll(li);
		System.out.println(ex);
		
		ex.retainAll(li);
		System.out.println(ex);
		
		/*
		 * ex.removeAll(li); System.out.println(ex);
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
