package com.exception;

public class Exception8 {

	public static void main(String[] args) {

		try {

			int x = 25;
			int y = 0;
			System.out.println("result..." + x / y);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}

	}

}
