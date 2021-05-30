package com.exception;

import java.io.IOException;

import java.util.Scanner;

public class Exception12 {

	public static void main(String[] args) {
		try {
			throw new IOException();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
