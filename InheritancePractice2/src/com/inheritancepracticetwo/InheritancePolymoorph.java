package com.inheritancepracticetwo;

public class InheritancePolymoorph {

	public static void main(String[] args) 
	{
		A a=new A();//parent class
		a.a1();
		a.a2();
		a.common();
		
		System.out.println();
		B b=new B();//sub class of A
		b.b1();
		b.b2();
		b.b2("string");
		b.common();
	
		System.out.println();
		C c=new C();//sub class of B
		c.c1();
		c.c2();
		c.common();
		
		System.out.println();
		//super cls ref sub cls obj
		A a3=new B();
		A a4=new C();
		a3.common();
		System.out.println();
		a4.common();
		
	}

}
