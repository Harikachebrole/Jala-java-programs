package com.thissuper;

public class UsingthisAndsuper3 {
	
public UsingthisAndsuper3()
{
	System.out.println("Call constructor of the parent class using this");
}
public UsingthisAndsuper3(int x)
{
	this();
	System.out.println("one variable Call constructor of the parent class using this " +x);
}
public UsingthisAndsuper3(int x,int y)
{
	
	this(x);
	System.out.println("two variable Call constructor of the parent class using this " +(x+y));
}
public UsingthisAndsuper3(int x,int y,int z)
{
	this(x,y);
	System.out.println("two variable Call constructor of the parent class using this " +(x+y+z));
}

	public static void main(String[] args)
	{
		
		UsingthisAndsuper3 t3=new UsingthisAndsuper3(20,30,40);
	
	}

}
