package com.exception;

public class HarikaException6 extends Exception {

	public HarikaException6(String s) {
		String str = s;
	}

	public static void main(String[] args) {
		try {

			System.out.println("my new exception");
		} catch (Exception e) {
			e.getMessage();
			System.out.println(e);
		}

	}

}
