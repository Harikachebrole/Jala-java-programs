package com.inheritance;

public class CreateClssACbCc {

	public static void main(String[] args)
	{
		CreateClssACbCc create = new CreateClssACbCc();
		A a = new A();
		a.collegename();
		a.id();
		a.name();
		System.out.println("____________________________________________");
		B b = new B();
		b.name();
		b.passout();
		b.percentage();
		b.id();
		System.out.println("____________________________________________");
		C c = new C();
		c.name();
		c.dteofbrth();
		c.stream();
		System.out.println("____________________________________________");
		
		A a1=new B();//super cls ref sub cls obj
		a1.name();
		
		a1.collegename();
		System.out.println("____________________________________________");
		A a2=new C();
		a2.name();
	}

}
