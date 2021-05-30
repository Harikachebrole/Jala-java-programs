package com.abstractpractice;

public class AbstractSubclass extends AbsrtClaWithabstrAndNonAbsrct 
{
	public  void a1()
	{
		System.out.println("inside abstract sub class impl");
	}
	
	public  void sub() 
	{
		b1();
	}
	public static void main(String[] args)
	{
		AbstractSubclass av=new AbstractSubclass();
		AbsrtClaWithabstrAndNonAbsrct aca=new AbstractSubclass();
		aca.a1();
		av.sub();
		av.a1();
	}

}
