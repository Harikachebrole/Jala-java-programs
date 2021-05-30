package com.privateacesmod;

public class Protected2 extends Protectedpractice
{

	public static void main(String[] args) 
	{
		Protected2 p2=new Protected2();
		System.out.println("The value of string s1..."+p2.s1);
		System.out.println("The value of s2..."+p2.s2);
		System.out.println("The value of s1 conct s2..."+p2.conc(p2.s1,p2.s2));

	}

}
