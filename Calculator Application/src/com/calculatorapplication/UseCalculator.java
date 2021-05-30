package com.calculatorapplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UseCalculator {

	public static void main(String[] args) {

		InputStreamReader uci = new InputStreamReader(System.in);
		BufferedReader ucbr = new BufferedReader(uci);
		System.out.println(
				"Please Enter you selected Caluculatr type \n 1. Normal Caluculator \n 2. Scientific caluclator \n");
		int selectvalue;
		try {
			selectvalue = Integer.parseInt(ucbr.readLine());
			switch (selectvalue) {
			case 1:
				Calculator.mainMenu();
				break;
			case 2:
				Scientificcalculator.mainMenu();
				break;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
