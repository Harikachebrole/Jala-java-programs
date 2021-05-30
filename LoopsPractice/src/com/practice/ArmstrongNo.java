package com.practice;

import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args)
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a value....");
		int originalno=sc.nextInt();
		int remainder, temp = originalno, org = 0;
		while (temp!=0) 
		{
			remainder = temp % 10;
			temp = temp / 10;
			org = org + (remainder * remainder * remainder);
		}
		System.out.println(org);
		if (originalno == org) {
			System.out.println("Armstrong number.....");
		} else {
			System.out.println("Not Armstrong number");
		}

	}
}

