package com.practise;


import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HasLinTremap {

	public static void main(String[] args) {
		
		
	Map<Integer,String> ex= new HashMap<Integer,String>();
	
	ex.put(10,"java");
	ex.put(20, "java"); // value will allow duplicate
	ex.put(30, "sql");
	ex.put(40, "sales");
	ex.put(40, "fire");  //key doesnt allow duplicate
	ex.put(null,null);   // it will execute only one null
	ex.put(null, null);
	
	System.out.println(ex); // it prints in random order
	
	Map<Integer,String> ex1 = new LinkedHashMap<Integer,String>();
	
	ex1.put(1, "Akshay");
	ex1.put(2, "Nidhi");
	ex1.put(3, "Ravi");
	ex1.put(4, "Uma");
	ex1.put(4, "Ravi");
	
	System.out.println(ex1); // it prints in insertion order
	
	String s=ex1.get(3);  // if we put key it give values
		System.out.println(s);
		
		Set<Integer> ks =ex1.keySet();	
		System.out.println(ks);
		
		Collection<String> v=ex1.values();
		System.out.println(v);
		
		Set<Entry<Integer,String>> es=ex1.entrySet();  // entry set
		
		for(Entry<Integer,String> es1:es ){
		
			System.out.println(es1.getKey());
			System.out.println(es1.getValue());
		}
		
		
	
	}
	
	
}
