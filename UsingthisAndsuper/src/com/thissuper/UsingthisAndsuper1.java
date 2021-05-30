package com.thissuper;

public class UsingthisAndsuper1 
{
	int i;
	int j;
	
	public UsingthisAndsuper1(int n)
	{
		this();

		System.out.println("one parameterized constructor printing values "+n);
	
	}
	public UsingthisAndsuper1(int n,int m)
	{
		this(n);
		this.j=m;
		this.i=n;

		System.out.println("Two parameterized constructor printing values "+i);
		System.out.println("Two parameterized constructor printing values "+m);
	}
	public UsingthisAndsuper1()
	{
				System.out.println("Two parameterized constructor printing values ");
	}

	public static void main(String[] args)
	{
		
		UsingthisAndsuper1 t1=new UsingthisAndsuper1(30,20);
		
	}

}
