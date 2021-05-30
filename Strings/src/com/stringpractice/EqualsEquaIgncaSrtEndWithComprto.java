package com.stringpractice;

import java.util.Scanner;

public class EqualsEquaIgncaSrtEndWithComprto {
	public static String equals(String x,String y)
	{
		if(x.equals(y))
		{
			return "both are equal";
		}
		else
		{
			return "both are not equal";
		}
	}
	public static String equalsIgnoreCase(String x,String y)
	{
		if(x.equalsIgnoreCase(y))
		{
			return "both are equal";
		}
		else
		{
			return "both are not equal";
		}
	}
	public static String startWith(String x,String y)
	{
		if(x.startsWith(y))
		{
			return x;
		}
		else
			return y;
	}
	public static String endWith(String x,String y)
	{
		if(x.endsWith(y))
		{
			return y;
		}
		else
			return x;
	}
	public static String CompareTo(String x,String y)
	{ 
		if(x.compareTo(y)==0)
		{
			return "both are equal";
	}
	else
	{
		return "both are not equal";
	}
				
	}

	public static void main(String[] args) 
	{Scanner sc=new Scanner(System.in);
	System.out.println("---Enter first string---");
	String s1=sc.nextLine();
	System.out.println("---Enter second string---");
	String s2=sc.nextLine();	
		EqualsEquaIgncaSrtEndWithComprto e1= new EqualsEquaIgncaSrtEndWithComprto();
		System.out.println("-----starts with---- "+e1.startWith(s1, s2));
		System.out.println("---compare to--- "+e1.CompareTo(s1, s2));
		System.out.println("----equals--- "+e1.equals(s1, s2));
		System.out.println("---equals ignore case---- "+e1.equalsIgnoreCase(s1, s2));
		System.out.println("---end with--- "+e1.endWith(s1, s2));
		
	}

}
