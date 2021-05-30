package com.practice;

import java.util.Scanner;

public class EvenAndOddNos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number.....");
		int a = sc.nextInt();
		
		if(a % 2==0)
		{
			System.out.println("EVEN NUMBER....");
		}
		else
			System.out.println("ODD NUMBER....");
	}
}