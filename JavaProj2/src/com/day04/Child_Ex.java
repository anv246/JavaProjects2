package com.day04;

public class Child_Ex extends Parent_Ex{
	
	int iChildID = 20;
	String sChildName = "Varsha";
	
	public Child_Ex() {
		super(10);
		System.out.println("Child Default Constructor");
	}
	
	public void display() {
		System.out.println("Child ID is : "+iChildID);
		System.out.println("Child Name is : "+sChildName);
		//print();
	}

	public void print() {
		System.out.println("Method Override");
	}
	public static void main(String[] args) {
		Child_Ex oChild = new Child_Ex();
		oChild.print();
		oChild.display();
		
		System.out.println("======Parent Class======");
		Parent_Ex oParent = new Parent_Ex(100);
		oParent.print();
		
		System.out.println("======Reference for Parent and Object for Child======");
		Parent_Ex oRef = new Child_Ex();
		oRef.print();
		
	}

}
