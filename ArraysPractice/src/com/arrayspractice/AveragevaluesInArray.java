package com.arrayspractice;

import java.util.Scanner;

public class AveragevaluesInArray {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("how many values of an array....");
		int a=sc.nextInt();
		int[] array= new int[a];
		int avg=0,sum=0;
		System.out.println("Enter array values....");
		for(int i=0;i<array.length;i++)
		{
			array[i]=sc.nextInt();
		}
		for(int i=0;i<array.length;i++)
		{
			sum= sum+array[i];
		}
		avg=sum/array.length;
		System.out.println(("sum of the values....")+sum);
		System.out.println("avg of the array values:"+avg);

	}

}
