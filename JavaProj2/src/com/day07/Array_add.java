package com.day07;

public class Array_add {

	public static void main (String args[]) {
		
		int a[][] = {{1,2},{3,4}}; 
		int b[][] = {{5,6},{7,8}};
		int c[][] = new int[2][2];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j]+"  ");
				
			}
			
			System.out.println();
		}
				
	}
	
}