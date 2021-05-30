package com.privateacesmod;

public class PrivateAcessmodifiers 
{
	private int i = 10;
	private int j = 20;

	private int add(int x, int y) {
		return x + y;
	}
	public static void main(String[] args)
	{
		PrivateAcessmodifiers pas = new PrivateAcessmodifiers();
		System.out.println("The value of i is...." + pas.i);
		System.out.println("The value of j is...." + pas.j);
		System.out.println("The value of i+j is...." + pas.add(pas.i, pas.j));
	
}
}
