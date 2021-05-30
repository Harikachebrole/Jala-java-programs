package com.arrayspractice;

import java.util.Scanner;

public class IndexValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of values......");
		int a = sc.nextInt();
		int[] arr = new int[a];
		System.out.println("enter values into array.....");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			}
		for (int i = 0; i < arr.length; i++)
		{
			int b=i;
			System.out.println("the index value "+b+" is...."+arr[i]);
		}
	}
}
