package com.day07;

public class Array_Ex2 {

	public static void main(String[] args) {
		int a[][] = {{10,20,30},{40,50,60},{70,80,90}};
		
		//System.out.println(a[1][0]);
		
	for(int i=0;i<a.length;i++) {
			//System.out.println("Column Size is : "+a[i].length);
			
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
	}

}
