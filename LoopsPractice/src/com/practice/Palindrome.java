package com.practice;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a value....");
		int number=sc.nextInt();
		int temp=number;
		int remainder;
		int sum=0;
		while(number!=0)
		{
			remainder=number%10;
			number=number/10;
			sum=sum*10+remainder;
		}
		if(temp==sum)
		{
			System.out.println("Palindrome...");
		}
		else
			System.out.println("Not Palindrome...");
	}

}
