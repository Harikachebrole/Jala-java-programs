package com.stringpractice;

import java.util.Scanner;

public class SearchStrngUsngIndexof {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter main string");
		String s1=sc.nextLine();
		System.out.println("Enter sub string");
		String search=sc.nextLine();
		if(s1.contains(search)) {
		int index=s1.indexOf(search);
		System.out.println("indexvalue of sub string is "+index);
		}
		else
		{
			System.out.println("substring does not exists...");
		}
	}

}
