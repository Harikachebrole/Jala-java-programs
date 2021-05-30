package com.arrayspractice;

import java.util.Scanner;

public class EvenAndOddInArray {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of values......");
		int a = sc.nextInt();
		int[] arr = new int[a];
		System.out.println("enter values into array.....");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]+" ");
		}
		
		System.out.println();
	System.out.println("----EVEN NUMBERS-----");
		for(int i=0;i<arr.length;i++)
		{
						if(arr[i]%2==0)
			{
				System.out.println(arr[i]);
			}
	
		}
		System.out.println("----ODD NUMBERS-----");
		for(int i=0;i<arr.length;i++)
		{
						if(arr[i]%2!=0)
			{
				System.out.println(arr[i]);
			}
	
		}}	}