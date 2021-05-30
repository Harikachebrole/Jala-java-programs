package com.exception;

public class Exception1 {

	public int cmm(int x, int y) {
		return x / y;
	}

	public static void main(String[] args) {

		int x = 25;
		int y = 0;
		System.out.println("result..." + x / y);

	}
}