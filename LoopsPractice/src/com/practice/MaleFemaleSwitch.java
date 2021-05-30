package com.practice;

import java.util.Scanner;

public class MaleFemaleSwitch {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter gender....");
		String s=sc.nextLine();
	switch(s)
	{
	case "F":
	case "f":
		System.out.println("FEMALE");
		break;
	case "M":
	case "m":
		System.out.println("MALE");
		
	}
	}

}
