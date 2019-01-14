package com.day09;

public class Exception_Handling {

		
	public static void main (String args[])
	{
		
		int a[] = {10,20,30,40,50};
		try {
		for(int i=0;i<=a.length;i++)
		{
			System.out.println(a[i]);
		}
		}
		
	/*	catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.fillInStackTrace());
		}
		*/
		catch (Exception e)
		{
			System.out.println(e.getStackTrace());
		}
		
		
		System.out.println("rest of the code");
	}
	
	
}
