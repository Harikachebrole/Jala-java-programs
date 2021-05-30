package com.exception;

public class Exception9 {

	public static void main(String[] args)
	{
		try
		{
		int[] a=new int[4];
		a[5]=6;
		System.out.println("the value of a[6] is.."+a[6]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index OutOfBounds Exception");
			e.printStackTrace();
		}
		
	}

}
