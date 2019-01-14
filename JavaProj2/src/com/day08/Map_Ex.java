package com.day08;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

public class Map_Ex {
	
	public static void main (String args[])
	{
		Map<Integer, String> oMap = new HashMap<>();
		
		oMap.put(100, "Angular");
		oMap.put(101, "Java");
		oMap.put(100, "Appium");
		oMap.put(102, "C#");
		oMap.put(103, "Python");
		oMap.put(104, "Dot Net");
		oMap.put(90, "Selenium");
		oMap.put(200, "Selenium");
		System.out.println(oMap);
		
		System.out.println("Get Value Based on Key : "+oMap.get(104));
		
		Set<Integer> oSet = oMap.keySet();
		
		for(Integer i:oSet)
		{
			//System.out.println(i);
			System.out.println(i+"=="+oMap.get(i));
		}
		
		List<String> oList = new ArrayList<>();
		oList.add("Selenium");
		oList.add("QTP");
		oList.add("ALM");
		oList.add("Jira");
		oList.add("JMeter");
		oList.add("Load Runner");
		
		List<String> oList1 = new ArrayList<>();
		oList1.add("C");
		oList1.add("C++");
		oList1.add("Java");
		oList1.add("Python");
		oList1.add("C#");
		oList1.add("Java Script");
				
		Map<String, List<String>> oMap1 = new HashMap<>();
		
		oMap1.put("Testing", oList);
		oMap1.put("Development", oList1);
		System.out.println(oMap1);
		Set<String> oSet1 = oMap1.keySet();
		//System.out.println(oMap1.get("Development"));
		System.out.println("for loop");
		for(String s:oSet1)
		{
			
			//System.out.println(s);
			//System.out.println(s+"=="+oMap1.get(s));
			
			for(int i=0;i<oMap1.get(s).size();i++)
			{
				System.out.println(s+"=="+oMap1.get(s).get(i));
			}
		}
	}

}
