package com.day04;

public class Parent_Ex {

	int iParentID = 10;
	String sName = "Mathan";
	
	public Parent_Ex(int i) { 
		System.out.println("Parent Default Constructor");
	}
	
	public void print() {
		System.out.println("Parent ID : "+iParentID);
		System.out.println("Parent Name is : "+sName);
	}

}

