package com.inheritance;

public class B extends A {
	public void name() {
		System.out.println("inside class B  name method");
	}

	public void name(String name) {
		System.out.println("inside class B  name method" + name);
	}

	public void percentage() {
		System.out.println("inside class B percentage method");
	}

	public void passout() {
		System.out.println("inside class B passout method");
		collegename();
	}

	public void id() {
		System.out.println("inside class B passout id");

	}
	public static void main(String[] args)
	{
		B b=new B();
	b.id();
	}

}
