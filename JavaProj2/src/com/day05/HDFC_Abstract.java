package com.day05;

public class HDFC_Abstract extends RBI_Abstract {
	
	public double emicreditcard() {
		return 0.3;
	}
	
	public static void main (String args[]) {
		
		HDFC_Abstract ohdfc = new HDFC_Abstract();
		System.out.println("homeloan interest is: " +ohdfc.homeloan());
		System.out.println("carloan interest is: " +ohdfc.Carloan());
		System.out.println("personalloan interest is: " +ohdfc.Personalloan());
		System.out.println("creditcard interest is: " +ohdfc.emicreditcard());
		
		RBI_Abstract oref = new HDFC_Abstract();
		
		System.out.println("homeloan interest is: " +oref.homeloan());
		System.out.println("carloan interest is: " +oref.Carloan());
		System.out.println("personalloan interest is: " +oref.Personalloan());
		System.out.println("creditcard interest is: " +oref.emicreditcard());
	}

}
