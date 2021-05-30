package com.thissuper;

public class UsingthisAndsuper4 extends UsingthisAndsuper3 
{
	
	public UsingthisAndsuper4()
	{
		super(3,4);
	}
	public UsingthisAndsuper4(int x)
	{
		
		System.out.println("parent class value  is "+x);
	}
	public UsingthisAndsuper4(int z,int w)
	{
		
		System.out.println("parent class value  is "+w);
	}


	public static void main(String[] args) 
	{
		UsingthisAndsuper4 t4=new UsingthisAndsuper4();
		
	}

}
