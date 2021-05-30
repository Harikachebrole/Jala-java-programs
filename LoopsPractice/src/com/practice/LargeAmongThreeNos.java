package com.practice;

import java.util.Scanner;

public class LargeAmongThreeNos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number.....");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number.....");
		int b = sc.nextInt();
		System.out.println("Enter 3rd number.....");
		int c = sc.nextInt();
		if (a > b && b > c) {
			System.out.println("The largest number is....." + a);
		} else if (b > a && a > c) {

			System.out.println("The largest number is....." + b);
		} else if (c > b && b > a) {

			System.out.println("The largest number is....." + c);
		}
	}

}
