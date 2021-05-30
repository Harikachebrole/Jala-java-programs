//Write two methods with the same name but different number of parameters of same type
//and call the methods from main method
package com.methodoverloading;

public class Methodoverloading1 {
	public String name(String x,String y)
	{
		return x.concat(y);
		
	}
	public String name(String x)
	{
		return x; 
		
	}

	public static void main(String[] args)
	{
		 Methodoverloading1 m1=new  Methodoverloading1();
		 System.out.println("Name along eith initial.."+m1.name("Harika","Chebrole"));
		 System.out.println("Name without initial.."+m1.name("Harika"));
	}

}
