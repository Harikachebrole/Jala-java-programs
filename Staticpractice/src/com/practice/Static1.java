package com.practice;

public class Static1 {
	int length=10;
	int breadth=10;
	
	public static int a=10;//static variables
	public static int b=5;//static variables
   public String instanceMethod()//instance method
{
	return "Welcome to String practice";
}
	public static void main(String[] args) 
	{
	Static1 s1=new Static1();
	System.out.println(s1.instanceMethod());
	System.out.println(s1.length*s1.breadth);
	System.out.println("addition of two numbers.."+Static1.add(a, b));
	System.out.println("subtraction of two numbers.."+Static1.sub(a, b));
	}
public static int add(int x,int y)//static method
{
	return x+y;
}
public static int sub(int x,int y)//static method
{
	return x-y;
}
}
