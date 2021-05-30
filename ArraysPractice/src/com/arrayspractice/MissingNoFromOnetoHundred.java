package com.arrayspractice;

import java.util.Scanner;

public class MissingNoFromOnetoHundred {
	static int getMissingNo(int a[], int n) {
		int sum = n * (n + 1) / 2;
		int sum1 = 0;

		for (int i = 0; i < n - 1; i++)
			sum1 += a[i];

		return sum - sum1;
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 5, 6 };
		int n = a.length + 1;
		int miss = getMissingNo(a, n);

		System.out.print(miss);
	}
}
