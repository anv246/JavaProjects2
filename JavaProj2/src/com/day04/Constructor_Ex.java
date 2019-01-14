package com.day04;

public class Constructor_Ex {
	
	
	int rno = 200; String name = "vikram";
	
	public void print() {
		System.out.println("Name is: " + name);
		System.out.println("Roll no is: " + rno);
	}
		
	public Constructor_Ex() {
		
		System.out.println("This is a default constructor");
		
	}
	
	public Constructor_Ex(int no, String n) {
		
	rno = no;
	name = n;
				
	}
		
	
	public static void main (String args[]) {
		
		Constructor_Ex obj = new Constructor_Ex();
		obj.print();
		
		Constructor_Ex obj1 = new Constructor_Ex(123,"vijay");
		obj.print();
		obj1.print();
		
		Constructor_Ex obj2 = new Constructor_Ex(456,"vinoth");
		obj.print();
		obj1.print();
		obj2.print();
		
		
		
	}
	
}