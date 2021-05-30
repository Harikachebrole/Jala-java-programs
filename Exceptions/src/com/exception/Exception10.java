package com.exception;

public class Exception10 extends Exception1 {

	public static void main(String[] args)

	{
		try {
			Class.forName("package com.exception.Excepti1");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}