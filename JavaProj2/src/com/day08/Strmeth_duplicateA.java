package com.day08;

public class Strmeth_duplicateA {

	public static void main (String args[])
	{
		String s1 = "Vijayaraghavan";
		int j = 0;
		
		String ssplit[] = s1.split("");
		//System.out.println(ssplit[4]);
		
		for(int i=0;i<ssplit.length;i++)
		{
			if(ssplit[i].equals("a"))
			{
				j = j + 1;
			}
		}
	System.out.println("There are "+j+" number of 'A's in your name");
	}
}
