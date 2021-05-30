package com.stringpractice;

import java.util.Scanner;

public class SplitStngWthSplit {

	public static void main(String[] args)
	{
		String str="Enter string value is";
		String[] s=str.split(" ");
		//String[] s=str.split("e",1);
		//String[] s=str.split("e");
		//String[] s=str.split(" ",0);
		//String[] s=str.split("e",3);
		for(String a:s)
		{
		System.out.println(a);
	}
	}
}
