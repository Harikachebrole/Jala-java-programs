package com.arrayspractice;

import java.util.Scanner;

public class FindingSpecificElementInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value...");
		int a = sc.nextInt();
		boolean isfound=false;
		int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
			
		}
		
		for (int i = 0; i < arr.length; i++) 
		{
	       int b = i;
	       if(arr[i]==a)
	    	   isfound=true;
		}
		 if (isfound) 
			{
				System.out.println("given value " +a +" is existing in the array");
			} 
		
		   else 
		     {
			System.out.println("given value " +a +" is  not existing in the array");
	        	}
}
}