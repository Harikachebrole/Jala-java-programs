package com.operations;

import java.util.Scanner;

public class ArithOperators 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number: ");
		int a = sc.nextInt();
		System.out.println("enter second number: ");
		int b = sc.nextInt();
		System.out.println("enter the operator: ");
		ArithOperators op = new ArithOperators();
		
		System.out.println("Addition : "+ op.add(a, b));
		System.out.println("Subtraction : "+ op.sub(a, b));
		System.out.println("Multiple : "+ op.mul(a, b));
		System.out.println("Division : "+ op.div(a, b));
	}

	public int add(int x, int y) {
		return x + y;
	}

	public int sub(int x, int y) {
		return x - y;
	}

	public int mul(int x, int y) {
		return x * y;
	}

	public int div(int x, int y) {
		return x / y;
	}
}
