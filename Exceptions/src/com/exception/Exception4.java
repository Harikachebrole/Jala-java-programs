package com.exception;

public class Exception4 {

	public static void main(String[] args) {

		try {
			int[] a = new int[6];
			a[3] = 30;
			System.out.println("result..." + a[3] / 0);
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("cannot divide with zero");
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}

}
