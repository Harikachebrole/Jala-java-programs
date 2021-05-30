package com.arrayspractice;

import java.util.Scanner;

public class RemoveDuplicateElemnets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("how many values of an array....");
		int a = sc.nextInt();
		int[] arr = new int[a];
		System.out.println("enter values......");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("The new array is: ");
		int duplicate = 0;
		arr[duplicate] = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[duplicate] != arr[i]) {
				duplicate++;
				arr[duplicate] = arr[i];
				System.out.println(arr[duplicate]);
				System.out.println(duplicate);
			}
		}
		System.out.println(duplicate);
		for (int i = 0; i <= duplicate; i++) {
			System.out.print(arr[i] + " ");

		}

	}

}
