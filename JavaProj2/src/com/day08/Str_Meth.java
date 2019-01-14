package com.day08;

public class Str_Meth {

	public static void main(String[] args) {
		String s1 = "Mathan";
		String s2 = "MATHAN";
		String s3 = "Mathan";
		String s4 = "   Mathan Chan   ";
		String s5 = "vijay";
		String s6 = "my name is vijay";
		String s7 = "Train fare is : $  765  ";
		
		System.out.println("Equal Method : "+s1.equals(s2));
		System.out.println("Equal Method : "+s1.equals(s3));
		System.out.println("Equal Ignorecase Method : "+s1.equalsIgnoreCase(s2));

		System.out.println("Equal operator : "+(s1==s2));
		System.out.println("Equal operator : "+(s1==s3));
		
		System.out.println("Compare method: "+s1.compareTo(s2));
		System.out.println("compare method: "+s1.compareTo(s3));
		System.out.println("compare method ignorecase: "+s2.compareToIgnoreCase(s3));
		
		System.out.println("concat operator: "+s5.concat(" narayanan"));
		System.out.println(s5);
		System.out.println("lenght method: "+s5.length());
		s5 = s5.concat(" raghavan");
		System.out.println("length of "+s5+" is "+s5.length());
		
		System.out.println("to upper case: "+s5.toUpperCase());
		System.out.println("to lower case: "+s2.toLowerCase());
		
		System.out.println("contains method: "+s5.contains("vijy"));
		System.out.println("trim method: "+s4.trim());
		
		System.out.println("sub string: "+s5.substring(2));
		System.out.println("sub string: "+s5.substring(6,13));
		
		System.out.println("replace char: "+s5.replace('a','A'));
		System.out.println("replace string: "+s6.replace("vijay", "mathan"));
		System.out.println("replace string: "+s6.replace("vijay", "").trim());
		
		System.out.println("replace string using regex: "+s7.replaceAll("[a-zA-Z:$]", "").trim());
		System.out.println("replace string using regex: "+s7.replaceAll("[0-9]", "").trim());
		System.out.println("replace string using regex: "+s7.replaceAll("[^a-z A-Z]", "").trim());
		s7 = s7.replaceAll("[^0-9]", "").trim();
		int j = Integer.parseInt(s7);
		System.out.println("value of j is: "+j);
		String sdate = "23/11/2018";
		// sdate = sdate.split("/");
		String ssplit[] = sdate.split("/");
		//System.out.println(ssplit[1]);
		
		for(int i=0;i<ssplit.length;i++)
		{
			System.out.println(ssplit[i]);
			
		}
		
		String sname[] = s5.split("");
		
		for(int i=0;i<sname.length;i++)
		{
			System.out.println(sname[i]);
			
		}
		
		}
		
	}
