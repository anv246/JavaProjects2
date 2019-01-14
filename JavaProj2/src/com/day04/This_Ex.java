package com.day04;

public class This_Ex {
	
	int iRollNo = 100;
	String sName = "Mathan";
	
	public This_Ex(int iRollNo,String sName) {
		this();
		this.iRollNo = iRollNo;
		this.sName = sName;
		
	}
	public This_Ex(int i) {
		System.out.println("I value is : "+i);
	}
	public This_Ex() {
		this(100);
		System.out.println("This is a Default Constructor");
	}
	
	public void display(This_Ex oRef) {
		System.out.println("This is Display Method");
	}

	public void print() {
		System.out.println("Roll No is : "+iRollNo);
		System.out.println("Name is : "+sName);
	}
	
	public void display() {
		//print();
		this.print();
		this.display(this);
	}
	
	public This_Ex returnTest() {
		return this;
	}
	
	public Constructor_Ex returncons() {
		Constructor_Ex obj = new Constructor_Ex();
		return obj;
	}
	
	
	public static void main(String[] args) {
		This_Ex oBj = new This_Ex(10,"Vijay");
		oBj.print();
		oBj.display(oBj);
		System.out.println("======Display Method======");
		oBj.display();
		oBj.returnTest().display();
		oBj.returncons().print();
		
	}

}
