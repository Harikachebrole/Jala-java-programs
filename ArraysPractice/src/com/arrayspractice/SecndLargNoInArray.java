package com.arrayspractice;

import java.util.Scanner;

public class SecndLargNoInArray {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("how many values of an array....");
		int a=sc.nextInt();
		int[] arr= new int[a];
		int secndmax=0;
		System.out.println("Enter array values....");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		
		System.out.println("Given array values...");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]+" ");
		}
		for(int i=0;i<arr.length;i++)
		{
		for(int j=i+1;j<arr.length;j++)
			
			{
			if(arr[i]>arr[j])
			{
				secndmax=arr[i];
				arr[i]=arr[j];
				arr[j]=secndmax;
				secndmax=arr[i];
				
			}
		}
			
			}
		System.out.println();
		System.out.println(" second max value is    "+secndmax);
		
}

}
