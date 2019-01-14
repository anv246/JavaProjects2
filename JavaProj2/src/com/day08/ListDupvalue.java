package com.day08;
import java.util.List;
import java.util.ArrayList;

public class ListDupvalue {

	public static void main(String args[])
	{
		List<String> olist = new ArrayList<>();
		olist.add("Vijay");
		olist.add("Mathan");
		olist.add("Vishnu");
		olist.add("Vikram");
		olist.add("Karthick");
		olist.add("Vijay");
		Object a[] = olist.toArray();
		int count = 0;
		for(int i=0;i<a.length;i++)
		{
			//System.out.println(a[i]);
			for(int j=0;j<a.length;j++)
			{
				if(a[i].equals(a[j]))
						{
						count++;
						}
			}
			System.out.println("the number of duplicate values in the list is :"+count);
		}
		
		for(int i=0;i<olist.size();i++)
		{
			System.out.println(olist.get(i).);
		}
		
	/*	for(String s:olist)
		{
			for(int i=0;i<s.length();i++)
			{
				
			}
		}*/
		
	}
	
}
