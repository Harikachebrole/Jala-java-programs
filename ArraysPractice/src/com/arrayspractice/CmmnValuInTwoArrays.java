package com.arrayspractice;

public class CmmnValuInTwoArrays {

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50, 60, 70, 80 };
		int b[] = { 50, 60, 70, 80, 90, 100, 110 };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					System.out.println("-----common values are-----");
					System.out.println(b[j]);
				}
			}

		}
	}
}
