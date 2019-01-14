package com.day04;

import com.day03.Calculator;

public class InheritMultilevel extends OddorEven {
	
	public InheritMultilevel() {
		super();
		System.out.println("this is child default constructor");
	}

	public void print() {
		System.out.println("this is child class' print method");
	}
	public static void main (String args[]) {
		InheritMultilevel childobj = new InheritMultilevel();
		System.out.println("calling immediate parent class method using child obj");
		childobj.oddeven(57);
		System.out.println("calling parent of immediate parent class method using child obj");
		System.out.println("multiplication ans is: "+childobj.mul(25,4));
		System.out.println("calling print method using child object");
		childobj.print();
		System.out.println("creating parent object in child class");
		OddorEven obj = new OddorEven();
		System.out.println("calling print method using parent object");
		obj.print();
		System.out.println("creating reference for immediate parent and object for child");
		OddorEven ref1 = new InheritMultilevel();
		System.out.println("calling print method using reference object created for immediate parent & child");
		ref1.print();
		 System.out.println("creating reference for parent of parent class and object for child");
		Calculator ref2 = new InheritMultilevel();
		System.out.println("calling print method using reference object created for parent of parent & child");
		ref2.print(); 
	}
}
