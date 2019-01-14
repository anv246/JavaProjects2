package com.day04;

public class Static_Ex {
	
	int iRollNo;
	String sName;
	static String sBatch = "Weekend";
	static int iPage;
	
	public Static_Ex(int i,String s) {
		iRollNo = i;
		sName = s;
		iPage++;
		
	}
	
	static {
		System.out.println("This is Static Block 1");
	}
	
	static {
		System.out.println("This is Static Block 2");
	}

	public void print() {
		System.out.println("Roll No is : "+iRollNo);
		System.out.println("Name is : "+sName);
		System.out.println("Batch is : "+sBatch);
		System.out.println("Page Value is : "+iPage);
	}
	
	public static void display() {
		System.out.println("This is a Static Method");
		
	}
	

	public static void main(String[] args) {
		Static_Ex oBj1 = new Static_Ex(100, "Vishnu");
		oBj1.print();
		
		Static_Ex oBj2 = new Static_Ex(101, "Mathan");
		oBj2.print();
		
		Static_Ex oBj3 = new Static_Ex(103, "Surya");
		oBj3.print();
		display();
		//Static_Ex.display();
		
	}

}
