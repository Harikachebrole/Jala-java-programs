package com.calculatorapplication;

public class Calculate implements ICalc{
	
	double value;
	
	public Calculate(double a, char op, double b)
	{
	    value = docalculate(a, op, b);
		getresult(value, op);
		
	}
	public Calculate() {
			
	}

	public void getresult(double c, char op)
	{
		switch (op)
		{
		case '+':
			System.out.println("Addition of two numbers is: "+ c );
			break;
		case '-':
			System.out.println("subtraction of two numbers is: "+ c);
			break;
		case '*':
			System.out.println("Multiplication of two numbers is: "+ c );
			break;
		case '/':
			System.out.println("Division of two numbers: " + c);
			break;
		case 's':
		case 'S':
			System.out.println("The value of sine is: "+c);
			break;
		case 'c':
		case 'C':
			System.out.println("The value of cosine is: "+c);
			break;
			case 't':
			case 'T':
				System.out.println("The value of tan is: "+c);
				break;
				case 'l':
				case 'L':
					System.out.println("The value of log is: "+c);
					break;
		}
	}
	public double docalculate(double a, char op, double b)
	{
		double dc=0;
		
		if(op=='+')
		{
			dc=a+b;
			
		}
		else if(op=='-')
		{
		dc =a-b;
			}
		else if(op=='*')
		{
			dc =a*b;
		}
		else if(op=='/')
		{
			dc=a/b;
		}
		else if(op=='s'||op=='S')
		{
			dc=Math.sin(a);
		}
		else if(op=='c'||op=='C')
		{
			dc=Math.cos(a);
		}
		else if(op=='t'||op=='T')
		{
			dc=Math.tan(a);
		}
		else if(op=='l'||op=='L')
		{
			dc=Math.log(a);
		}
		else 
		{
			System.out.println("no such operator");
		}
			
		return dc;
	}

	
	}
	

