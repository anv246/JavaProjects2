package com.day04;

import com.day03.Calculator;

public class Inherit extends Calculator {

public static void main (String[] args) {
	Inherit obj = new Inherit ();
	System.out.println("mul is: " + obj.mul(10,2));
	System.out.println("sum is: " + obj.sum(5,10));
	
}
	
	
}


