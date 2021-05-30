package com.arrayspractice;

import java.util.ArrayList;
import java.util.Scanner;

public class InsertValueInSpecificPos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value...");
		int a = sc.nextInt();
		int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i] + " ");

		}
		System.out.println();
		System.out.println("-------new array-------");
		arr[a] = 45;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i] + " ");

		}

	}
}
