package com.day03;


public class Calculator {

	int a=10, b=20, c;

			
	public int sum(int a, int b)

	{
		c=a+b;
		return c;
		
	}
	
	public void sub(int a, int b)

	{
		c=b-a;
		System.out.println("subtraction result is: "+c);
		
	}
	
	public int mul(int a, int b)

	{
		c=a*b;
		return c;
		
	}
	
	public float div(float a,int b)

	{
		float c;
		
		c=a/b;
		return c;
		
	}
	
	public void print() {
		System.out.println("this is parent of parent class' print method");
	}
	
	public static void main(String[] args) {
		
		//float d;
	
		// int a=10, b=20, c;
		// c=a+b;
		
		Calculator objcalc = new Calculator();
		
		System.out.println("Sum is: " + objcalc.sum(35,10));
		
		objcalc.sub(100, 25);
		//System.out.println("Sum is: " + objcalc.sub(100,25));
		
		System.out.println("Multiplication result is: " + objcalc.mul(5,4));
		
		System.out.println("division result is: " + objcalc.div(2,10));

	}

}

