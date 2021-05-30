package com.arrayspractice;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveSpecificEleInArray {
	static int deleteElement(int arr[], int n, int x) {

		int i;
		for (i = 0; i < n; i++)
			if (arr[i] == x)
				break;
		if (i < n) {
			n = n - 1;
			for (int j = i; j < n; j++)
				arr[j] = arr[j + 1];
		}

		return n;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i] + " ");
		}
		System.out.println();
		System.out.println(" enter the value from array...");
		int a = sc.nextInt();// element to be removed
		int n = arr.length;
		n = deleteElement(arr, n, a);
		System.out.println();
		System.out.println("Modified array is");
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}

}
