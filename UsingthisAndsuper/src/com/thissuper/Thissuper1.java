package com.thissuper;

public class Thissuper1 
{
	int k;
	int m;

	public Thissuper1(int i)
	{
		this();
		this.k = i;
		System.out.println("One parameter constructor of Thissuper1 " + k);
	}
	public Thissuper1()
	{
		System.out.println("No parameter constructor of Thissuper1 ");
	}
	
	public Thissuper1(int i, int n)
	{
		this(i);
		this.m=n;
		System.out.println("two parameter constructor of Thissuper1 "+ m );
	}

	public static void main(String[] args)
	{
		Thissuper1 t1=new Thissuper1(10);
		

	}

}
