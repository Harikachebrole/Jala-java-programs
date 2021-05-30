package com.inheritancepracticetwo;

public class C extends B
{
	int k=40;
	public void c1()
	{
	System.out.println("class C with c1 method");
	}
	public void c2()
	{
	System.out.println("class C with c2 method");
	b1();
	}
	public void common()
	{
	System.out.println("class C with common method");
	System.out.println("value of i from class A "+i);
	System.out.println("value of j from class B "+j);
	System.out.println("value of k from class c "+k);
	}


}
