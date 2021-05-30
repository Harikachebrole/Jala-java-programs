package com.interfacepractice;

public class ClassPublicIntrface implements Publicinterface 
{
	public void mul()
	{
		System.out.println("The value of multiplication of i*j is.."+i*j);
	}
	public static void main(String[] args) 
	{
	ClassPublicIntrface cpi=new ClassPublicIntrface ();
		System.out.println("The value of i is "+i);
		System.out.println("The value of i is "+j);
		cpi.mul();
		

	}

}
