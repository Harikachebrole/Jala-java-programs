package com.stringpractice;

import java.util.Scanner;

public class StrngAgnstReglrExprsnWithMatches {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s="welcome to string in java programming";
		
		System.out.println("enter a string to find ");
		String regex=sc.nextLine();
		boolean isExists=true;
	    boolean s1=s.matches(regex);
	    if(s1==isExists)
	    {
	    	System.out.println("-----given string is-----");
			System.out.println(s);
	    	System.out.println("-----String exists---");
	    	System.out.println(regex);
	    }
	    else
	    	System.out.println("string does not exists...");
	}

}
