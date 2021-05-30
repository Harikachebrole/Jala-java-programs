package com.protectedp3;

import com.privateacesmod.Protectedpractice;

public class Protected3 extends Protectedpractice
{

	public static void main(String[] args) 
	{
		Protected3 p3=new Protected3();
		System.out.println("The value of string s1..."+p3.s1);
		System.out.println("The value of s2..."+p3.s2);
		System.out.println("The value of s1 conct s2..."+p3.conc(p3.s1,p3.s2));

	}

}
