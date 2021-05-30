package com.operations;

import java.util.Scanner;

public class EqualandNotequal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first value: ");
		int a = sc.nextInt();
		System.out.println("enter second value: ");
		int b = sc.nextInt();
		if (a == b) 
		{
			System.out.println("values are  equal....");
		}
		if(a!=b)
		{
			System.out.println("values are not equal....");
		}
	}
}
