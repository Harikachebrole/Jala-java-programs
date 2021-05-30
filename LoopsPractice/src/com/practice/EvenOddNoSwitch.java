package com.practice;

import java.util.Scanner;

public class EvenOddNoSwitch {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a value....");
		int numb=sc.nextInt();
		switch(numb%2)
		{
		
		case 0:
			System.out.println("EVEN NUMBER.....");
			break;
		case 1:
			System.out.println("ODD NUMBER.....");
	}}

}
