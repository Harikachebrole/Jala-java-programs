package com.arrayspractice;

public class CopyElementsInArrays 
{

	public static void main(String[] args)
	{
		int[] a1= {10,20,30,40,50,60,70};
		int[] a2= {11,22,33,44,55,66,77};
		System.out.println("values of a1...");
		
		for(int i=0;i<a1.length;i++)
		{
			System.out.print(" "+a1[i]+" ");
		}
		System.out.println();
		System.out.println("values of a2...");
		for(int j=0;j<a2.length;j++)
		{
			System.out.print(" "+a2[j]+" ");
		}
		System.out.println();
		System.out.println("-----------------After copying the array values----------------");
		a1=a2;
		System.out.println("values of a1...");
		for(int i=0;i<a1.length;i++)
		{
			System.out.print(" "+a1[i]+" ");
		}
		System.out.println();
		System.out.println("values of a2...");
		for(int j=0;j<a2.length;j++)
		{
			System.out.print(" "+a2[j]+" ");
		}
	}

}
