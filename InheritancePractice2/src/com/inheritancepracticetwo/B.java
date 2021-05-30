package com.inheritancepracticetwo;

public class B extends A
{
	int j=30;
	public void b1()
	{
	System.out.println("class B with b1 method");
	}
	public void b2()//same class having same signature(public void) and same method name but different arguments
	{
	System.out.println("class B with b2 method");
	}
	public void b2(String b)
	{
	System.out.println("class B with b2 method");
	a1();
	}
	public void common()
	{
	System.out.println("class B with common method");
	System.out.println("value of j from class B "+j);
	System.out.println("value of i from class A "+i);
	}


}
