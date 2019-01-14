package com.day08;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;


public class List_Ex {

	public static void main (String args[])
	{
		List<String> olist = new ArrayList<>();
		olist.add("Vijay");
		olist.add("Mathan");
		olist.add("Vishnu");
		olist.add("Vikram");
		olist.add("Karthick");
		olist.add("Vijay");
		
		System.out.println(olist);
		
		olist.add(3, "Gopi");
		
		System.out.println(olist);
		
		List<String> olist1 = new ArrayList<>();
		
		olist1.add("dhivya");
		olist1.add("sowmya");
		olist1.add("priya");
		olist1.add("akshaya");
		
		System.out.println(olist1);
		
		//olist.addAll(olist1);
		
		olist.addAll(5, olist1);
		System.out.println(olist);
		
		System.out.println("contains method: "+olist.contains("soorya"));
		System.out.println("get method: "+olist.get(4));
		System.out.println("get method: "+olist.get(7).equals("priya"));
		System.out.println("get and contains: "+olist1.get(1).contains("Sowmya"));
		System.out.println("size method: "+olist.size());
		System.out.println("sublist method: "+olist.subList(3, 10));
		System.out.println("index of method: "+olist.indexOf("priya"));
		
		System.out.println("for loop for list. print all elements in list one by one");
		
		for(int i=0;i<olist.size();i++)
		{
			System.out.println(olist.get(i));
		}
		
		System.out.println("for each loop for list.print each elements in list one by one");
		
		for(String x:olist)
			
		{
			System.out.println(x);
		}
		
		System.out.println();
		System.out.println("while loop for list");
		
		int i=0;
		while(i<olist.size())
		{
			System.out.println(olist.get(i));
		 i++;	
		}
		
		System.out.println("*****Iterator****");
		
		Iterator<String> oitr = olist.iterator();
		
		while(oitr.hasNext())
		{
			System.out.println(oitr.next());
			
		}
		
		System.out.println();
		System.out.println("linked list");
		
		List<String> olist2 = new LinkedList<>();
		
		olist2.add("skoda");
		olist2.add("volkswagon");
		olist2.add("audi");
		olist2.add("Bentley");
		
		System.out.println(olist2);
		
	}
	
}
