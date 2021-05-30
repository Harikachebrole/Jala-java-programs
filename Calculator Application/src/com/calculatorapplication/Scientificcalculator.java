package com.calculatorapplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

//import sun.swing.FilePane;

public class Scientificcalculator extends Calculate {

	public Scientificcalculator(double a, char op, double b) {
		super(a, op, b);

	}

	public static void mainMenu() {
		try {
			Calculate c = new Calculate();
			InputStreamReader sci = new InputStreamReader(System.in);
			BufferedReader scbr = new BufferedReader(sci);
			System.out.println("Please enter the number of times you would like to do Operation  : ");
			int count = Integer.parseInt(scbr.readLine());
			int n = 0;
			do {
				InputStreamReader i1 = new InputStreamReader(System.in);
				BufferedReader br1 = new BufferedReader(i1);
				System.out.println("Enter a number: ");
				int a = Integer.parseInt(br1.readLine());
				System.out.println("Enter the operator(sin,cos,log,tan): ");
				char op = (char) br1.read();
				//double d = c.docalculate(a, op, 3);
				//c.getresult(d, op);
				new Scientificcalculator(a,op,3);
				n = n + 1;
			} while (n < count);
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}

	}
}
