package com.arrayspractice;

import java.util.Scanner;

public class DiffBnLargNdSmal {

	public static void main(String[] args)
	{
		DiffBnLargNdSmal d=new DiffBnLargNdSmal();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements..");
		int a = sc.nextInt();
		int max = 0;
		int min = 0;
		int[] arr = new int[a];
		System.out.println("Enter array values...");
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i] = sc.nextInt();
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}	
System.out.println("maximum value is... "+max);
		min=arr[0];
			for (int i= 0; i < arr.length; i++)
			{
				if (arr[i] <min) 
				{
					min = arr[i];
				}
				
			}
			System.out.println("minimum value is... "+min);
			System.out.println("Diferece betwee max and minimum value is....."+d.diff(max,min));
			}
	public static int diff(int x, int y)
	{
		return x-y;
	}
	

}
