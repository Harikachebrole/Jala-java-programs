package com.practice;

public class LargestFromGivenNos
{

	public static void main(String[] args)
	{
		int i=10,j=20,k=30;
		if(i>=j&&j>=k)
		{
			System.out.println("Largest number is.."+i);
		}
		else if(j>=i&&i>=k)
		{
			System.out.println("Largest number is.."+j);
		}
		else
		{
			System.out.println("Largest number is.."+k);
		}
	}

}
