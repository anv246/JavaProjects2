package com.day06;

public class BikesInterchild implements BikesInter, BikesInter1 {
	
	public BikesInterchild () {
		System.out.println("this is bikesinterchild class' default constructor");
	}

	public void classic350() {
		System.out.println("this is RE classic 350 bike");
	}
	
	public void classic500() {
		System.out.println("this is RE classic 500 bike");
	}

	public void standard()
	
	{System.out.println("this is RE standard 350 bike");
	
	}
	
	public void electra()
	
	{System.out.println("this is RE electra bike");
	
	}

	public void thunderbird() {
		System.out.println("this is RE thunderbird bike");
	}
	
	public static void main (String args[]) {
		
		System.out.println("creating object for bikesinterchild class");
		
		BikesInterchild ichild = new BikesInterchild();
		ichild.classic350();
		ichild.classic500();
		ichild.electra();
		ichild.standard();
		ichild.thunderbird();
		
		System.out.println("creating reference for bikesinter interface and obj for bikesinterchild class");
		
		BikesInter ichild1 = new BikesInterchild();
		ichild1.classic350();
		ichild1.classic500();
		ichild1.thunderbird();
		
		
		System.out.println("creating reference for bikesinter1 interface and obj for bikesinterchild class");
		
		BikesInter1 ichild2 = new BikesInterchild();
		ichild2.electra();
		ichild2.standard();
		
		
	}
}
