package com.calculatorapplication;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Calculator extends Calculate {
	public Calculator(double a, char op, double b) 
	{
		super(a, op, b);
		
	}

	public static void mainMenu() {

		try {
			InputStreamReader ci = new InputStreamReader(System.in);
			BufferedReader cbr = new BufferedReader(ci);
			System.out.println("Please enter the number of times you would like to do Operation  : ");
			int count = Integer.parseInt(cbr.readLine());
			int n = 0;
			do {
				InputStreamReader i1 = new InputStreamReader(System.in);
				BufferedReader br1 = new BufferedReader(i1);

				System.out.println("Enter first number: ");
				int a = Integer.parseInt(br1.readLine());
				System.out.println("Enter second number: ");
				int b = Integer.parseInt(br1.readLine());
				System.out.println("Enter the operator(+,-,*,/): ");
				char op = (char) br1.read();
				Calculator c = new Calculator(a, op, b);
				n = n+1;
			} while (n < count);
			
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}

	}
}
