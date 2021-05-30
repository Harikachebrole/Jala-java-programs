package com.privateacesmod;

public class DefaultMethdsAnthrClsSamePackge
{
	 int a=10;
	 int b=100;
	 int def(int x,int y)
	{
		return x+y;
	}
	public static void main(String[] args)
	{
		DefaultMethdsAnthrClsSamePackge dmc=new DefaultMethdsAnthrClsSamePackge();
		System.out.println("The value of a is.."+dmc.a);
		System.out.println("The value of b is.."+dmc.b);
		System.out.println("The value of a+b is.."+dmc.def(dmc.a,dmc.b));
	}

}
