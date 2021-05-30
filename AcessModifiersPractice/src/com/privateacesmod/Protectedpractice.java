package com.privateacesmod;

import java.util.Scanner;

public class Protectedpractice {
	protected String s1="Java";
	protected String s2="Career";
	protected String conc(String s1,String s2)
	{
		return s1.concat(s2);
	}

	public static void main(String[] args)
	
	{
		Protectedpractice pp=new Protectedpractice();
		System.out.println("The value of string s1..."+pp.s1);
		System.out.println("The value of s2..."+pp.s2);
		System.out.println("The value of s1 conct s2..."+pp.conc(pp.s1,pp.s2));
		//Access the PROTECTED fields and methods from any class in different package cannot be accessed..

	}

}
