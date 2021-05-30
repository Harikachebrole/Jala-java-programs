package com.exception;

public class Episode5 {

	public static void main(String[] args)
	{
		try
		{
			throw new HarikaException6("myerror");
		}
catch(Exception e)
		{
	System.out.println("Raised error is " + e.getMessage());
		}
	}

}
