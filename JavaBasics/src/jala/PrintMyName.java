package jala;

import java.util.Scanner;

public class PrintMyName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name :");
		String name = sc.nextLine();
		System.out.println("My name : " + name);
		sc.close();
	}

}
