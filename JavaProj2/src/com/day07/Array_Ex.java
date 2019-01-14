package com.day07;

public class Array_Ex {

	public static void main(String[] args) {
		int a[] = {10,20,30,40,50};
				
		for(int i=0;i<a.length;i++) {
						
			/*if(a[i]==30) {
				System.out.println("Value is 30 : "+a[i]);
				break;
			}else {
				System.out.println("Value is not 30 : "+a[i]);
			}
		
		
			if(a[i]==30) {
				System.out.println("Value is 30 : "+a[i]);
			}else if(a[i]==50){
				System.out.println("Value is 50 : "+a[i]);
			}else if(a[i]==20){
				System.out.println("Value is 20 : "+a[i]);
			}else {
				System.out.println("Value is either 10 or 40 : "+a[i]);
			}}}}*/
			
			switch (a[i]) {
			
			case 10:
				System.out.println("Switch Value is 10 : "+a[i]);
				break;
				
			case 40:
				System.out.println("Switch Value is 40 : "+a[i]);
				break;

			default:
				System.out.println("Switch value must be any one among 20, 30, 50 : " +a[i]);
				break;
			}
			
			
		}
		System.out.println("=======While Loop======");
		int i=0;
		while(i<a.length) {
			System.out.println(a[i]);
			i++;
		}
		System.out.println("=======Do While Loop======");
		do {
			System.out.println(a[i]);
			i++;
			
		} while (i<a.length);
	}
}

