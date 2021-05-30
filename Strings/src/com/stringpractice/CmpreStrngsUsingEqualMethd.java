package com.stringpractice;

import java.util.Scanner;

public class CmpreStrngsUsingEqualMethd {


	public static String equals(String x,String y)
	{
		if(x.matches(y))
		{
			return "both are equal";
			}
	else
	{
		return "both are not equal";
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("---Enter first string---");
		String s1=sc.nextLine();
		System.out.println("---Enter second string---");
		String s2=sc.nextLine();
		System.out.println(CmpreStrngsUsingEqualMethd.equals(s1, s2));
	}

}
