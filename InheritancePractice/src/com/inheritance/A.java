package com.inheritance;

public class A 
{
	public void name()
	{
		System.out.println("inside class A name method");
	}
	public void name(String name)
	{
		System.out.println("inside class A name method"+ name);
	}
	public void  id()
	{
		System.out.println("inside class A id method");
		name();
	}
	public void collegename()
	{
	System.out.println("inside class A  collegename method");
	}
}
