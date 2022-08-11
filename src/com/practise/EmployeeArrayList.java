package com.practise;

import java.util.ArrayList;
import java.util.List;

public class EmployeeArrayList extends NewArraylist{

	public static void main(String[] args) {
		
         List<EmployeeArrayList>  li = new ArrayList<EmployeeArrayList>();		
		EmployeeArrayList e1= new EmployeeArrayList();
		e1.setId(23);
		e1.setName("Akshay");
		e1.setEmail("ak@gmail");
		
		EmployeeArrayList e2= new EmployeeArrayList();
        e2.setId(02);
		e2.setName("kutty");
		e2.setEmail("kutty@1gmail");
		
		li.add(e1);
		li.add(e2);
		
		for(EmployeeArrayList x:li) {
			System.out.println(x.getEmail());
			System.out.println(x.getId());
			System.out.println(x.getName());
		}
		
	}
	
	
	
	
}
