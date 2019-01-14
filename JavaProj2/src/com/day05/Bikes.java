package com.day05;

public abstract class Bikes {

	public Bikes() {
		System.out.println("this is Bikes default constructor");
				
	}
	
	abstract void classic350();
	abstract void classic500();
	abstract void thunderbird();
	public void standard()
	
	{System.out.println("this is RE standard 350 bike");
	
	}
	
	public void electra()
	
	{System.out.println("this is RE electra bike");
	
	}
}
