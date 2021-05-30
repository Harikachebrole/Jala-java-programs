package com.arrayspractice;

import java.util.Scanner;

public class FindingElementsInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("how many values of an array....");
		int a = sc.nextInt();
		int[] array = new int[a];
		int[] array1 = { 12, 23 };
		boolean b = false;
		System.out.println("Enter elements of an array");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Values of an array");
		for (int i = 0; i < array.length; i++) {
			System.out.print(" " + array[i] + " ");
		}
		System.out.println();
		System.out.println("Finding elements of an array");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array1.length; j++) {
				if (array[i] == array1[j]) {
					System.out.println("12,23 elements of an array are found:");
					b = true;
					System.out.println(array1[j]);
				}
			}
		}
	}

}
