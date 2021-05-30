package com.practice;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		boolean isPrime = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("NUMBER.......");
		int number = sc.nextInt();
		for (int i = 2; i <= number / 2; i++) {
			int temp = number % i;
			if (temp == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println("PRIME NUMBER");
		} else {
			System.out.println("Not a PRIME NUMBER");
		}
		System.out.println(isPrime);
	}
}