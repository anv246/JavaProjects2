package com.day04;

import com.day03.Calculator;

public class OddorEven extends Calculator {
	
	public OddorEven() {
		System.out.println("this is immediate parent default constructor for class inheritmultilevel");
		this.oddeven(98);
	}
	public void oddeven(int a) {
		
		if ((a%2) == 0) {
			
			System.out.println(+a +" is an even number");
		}
		
		else
			
		{ System.out.println(+a +" is an odd number");
		
		}
	}

	public void print() {
		System.out.println("this is immediate parent class' print method");
	}
	public static void main (String args[]) {
		
		OddorEven obj = new OddorEven();
		obj.oddeven(99);
		System.out.println("--- parent class calculator---");
		System.out.println("answer for division is: " +obj.div(4,2));
		
		
	}
	
}
