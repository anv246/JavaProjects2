package com.day08;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set_Ex {

	public static void main (String args[])
	{
		
		Set<String> oset = new HashSet<>();
		oset.add("Vijay");
		oset.add("Mathan");
		oset.add("Vishnu");
		oset.add("Vikram");
		oset.add("Karthick");
		oset.add("Vijay");
		
	System.out.println(oset);
	
	List<String> olist1 = new ArrayList<>();
	
	olist1.add("Keerthi");
	olist1.add("Meena");
	olist1.add("Preethi");
	olist1.add("Divya");
	olist1.add("Meena");
	olist1.add(null);
	olist1.add(null);
	
	oset.addAll(olist1);
	System.out.println(oset);
	System.out.println();
	System.out.println("=======For Each======");
	
	for(String s:oset)
	{
		System.out.println(s);
	}
	
	System.out.println();
	System.out.println("=======Iterator=======");
	
	Iterator<String> oitr = oset.iterator();
	
	while(oitr.hasNext())
	{
		System.out.println(oitr.next());
	}
	System.out.println();
	System.out.println("=====To Array=====");
	Object o[] = oset.toArray();
	
	for(int i=0;i<o.length;i++)
	{
		System.out.println(o[i]);
	}
	
	Set<Integer> oset1 = new HashSet<>();
	
	oset1.add(100);
	oset1.add(200);
	oset1.add(300);
	oset1.add(400);
	oset1.add(500);
	System.out.println();
	System.out.println(oset1);
	System.out.println();
	System.out.println("=======Linked Hash Set========");
	
	Set<String> oSet2 = new LinkedHashSet<>();
	
	oSet2.add("Mathan");
	oSet2.add("Vijay");
	oSet2.add("Karthick");
	oSet2.add("Gopi");
	oSet2.add("Baskar");
	oSet2.add("Mathan");
	oSet2.add(null);
	oSet2.add(null);
	System.out.println(oSet2);
	
	System.out.println();
	System.out.println("=======Tree Set========");
	
	Set<String> oSet3 = new TreeSet<>();
	
	oSet3.add("Mathan");
	oSet3.add("Vijay");
	oSet3.add("Karthick");
	oSet3.add("Gopi");
	oSet3.add("Baskar");
	oSet3.add("Mathan");
	//oSet3.add(null);
	System.out.println(oSet3);
	
	}
	
}
