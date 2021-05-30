package com.stringpractice;

import java.util.Scanner;

public class ExtractStrngUsngSubStrng {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s1=sc.nextLine();
		String s2=s1.substring(2,6);
		System.out.println("----sub string is-----");
		System.out.println(s2);
		
	}

}
