package com.interfacepractice;

public class ImplTwoInterfaces implements InterfaceOne,InterfaceTwo
{
	public void i4() 
	{
		
	}
	
	public void in3()
	{
		System.out.println("impl two methods with same name from two interfaces");
	}
	public void in1()
	{
		System.out.println("Implements interfaceone in the class");
	}
	public void in2()
	{
		System.out.println("Implements interfacetwo in the class");
	}
	
	public static void main(String[] args)
	{
		ImplTwoInterfaces itf=new ImplTwoInterfaces();
         itf.in1();
         itf.in3();
         itf.i4();
	}

}
