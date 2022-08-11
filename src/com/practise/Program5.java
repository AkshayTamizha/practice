package com.practise;

public class Program5 {

	
		
		private void studentId(int num) {
			System.out.println("my phone number:"+num);
			}
		
		private void studentId(String name) {
			System.out.println("my name:"+name );		
	}
	private void studentId(int no, String empname ) {
		System.out.println("my employe name and num:"+no + ""+empname);
	}
	private void studentId(int dob,String mail, int phone) {
		
		System.out.println(" my name and mail id and phone no is:"+mail+" "+phone+" "+dob);
	}
	
	public static void main(String[] args) {
		
		Program5 emp = new Program5();
		emp.studentId(984088026);
		emp.studentId("Akshay");
		emp.studentId(23, "ak@gmail", 99628421);
		
		
	}
	
}
