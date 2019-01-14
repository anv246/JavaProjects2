package com.day05;

public class BikesChild2 extends BikesChild1{
	public BikesChild2() {
		System.out.println("this is BikesChild2 default constructor");
	}
	
	public void thunderbird() {
		System.out.println("this is RE thunderbird bike");
	}
		public static void main (String args[]) {
			
			System.out.println("creating object for bikeschild2 class");
			
			BikesChild2 child2 = new BikesChild2();
			child2.classic350();
			child2.classic500();
			child2.thunderbird();
			child2.standard();
			child2.electra();		
			
			System.out.println("***************************************************************");
			System.out.println("creating reference for Bikes class & object for bikeschild2 class");
			
			Bikes ref1 = new BikesChild2();
			ref1.classic350();
			ref1.classic500();
			ref1.thunderbird();
			ref1.standard();
			ref1.electra();
			
			System.out.println("***************************************************************");
			System.out.println("creating reference for BikesChild1 class & object for bikeschild2 class");
			
			BikesChild1 ref2 = new BikesChild2();
			ref2.classic350();
			ref2.classic500();
			ref2.thunderbird();
			ref2.standard();
			ref2.electra();
		}
		
	}
	
