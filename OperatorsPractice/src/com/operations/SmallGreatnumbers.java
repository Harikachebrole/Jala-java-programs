package com.operations;

import java.util.Scanner;

public class SmallGreatnumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:..");
		int N1 = sc.nextInt();
		System.out.println("Enter second number:..");
		int N2 = sc.nextInt();
		if (N1 > N2) {
			System.out.println("The largest number is:.." + N1);
			System.out.println("The smallest number is:.. " + N2);
		}

		else if (N1 <= N2) {
			System.out.println("The smallest numberis:..." + N1);
			System.out.println("The largest number is:..." + N2);

		}

	}
}
