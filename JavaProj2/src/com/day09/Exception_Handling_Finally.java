package com.day09;

public class Exception_Handling_Finally {

	public static void main (String args[])
	
	{
		int a[] = {1,2,3,4,5,6};
	
		try {
			
			for(int i=0;i<=a.length;i++)
			{
				System.out.println(a[i]);
			}
		}
		
		catch (Exception e)
		{
			System.out.println(e.fillInStackTrace());
		}
		
		finally {
			System.out.println("rest of the code");
		}
		
		
	}
}
