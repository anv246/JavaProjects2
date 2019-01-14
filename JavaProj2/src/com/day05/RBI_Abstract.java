package com.day05;

public abstract class RBI_Abstract {
	
	public RBI_Abstract (){
		System.out.println("this is RBI_Abstract default constructor");
	}

	public double homeloan() {
		return 8.5;
	}
	
	public double Carloan() {
		return 9.5;
	}
	
	public double Personalloan() {
		return 12.5;
	}
	
	abstract double emicreditcard();
	
	
}
