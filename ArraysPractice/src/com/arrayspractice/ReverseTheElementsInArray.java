package com.arrayspractice;

public class ReverseTheElementsInArray {

	public static void main(String[] args) 
	{
	int[] a= {10,20,30,40,50};
		for(int i=0;i<a.length;i++)
	{
		System.out.print(" " +a[i]+" ");
	}
	System.out.println();
	System.out.println("------After reversing-----");
	for(int i=a.length-1;i>=0;i--)
	{
	
		System.out.print(" "+a[i]+" ");
	}

	}

}
