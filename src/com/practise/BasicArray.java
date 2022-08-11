package com.practise;

public class BasicArray {

	//data type ar[] = newdatatype[length]
	
	public static void main(String[] args) {
		
		int ar[]= new int[5];
	 //System.out.println(ar[2]); // if we doesnt assign any value it take it as zero
		 ar[0]=1;
		ar[1]=2;
		ar[2]=3;
		ar[3]=4;
		ar[4]=5;
		
		
		System.out.println(ar[2]);
		
		int len = ar.length;
		System.out.println(len);
		
		for(int i=0;i<ar.length;i++) {  //forloop
			System.out.println(ar[i]);
		}
		//datatype new vriablne :ref = for each
		for(int num:ar) {
			System.out.println(num);
			
			
			
		}
		 	}
	
	
	
}
