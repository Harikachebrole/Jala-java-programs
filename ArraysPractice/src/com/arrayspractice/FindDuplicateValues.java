package com.arrayspractice;

import java.util.Scanner;

public class FindDuplicateValues {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("how many values of an array....");
		int a = sc.nextInt();
		int duplicate = 0;
		int[] arr = new int[a];

		System.out.println("enter values......");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("-------Duplicate values-------");
					System.out.println(arr[j]);

				}
			}
		}

	}
}
