package com.practicepublic;


public class PublicPractice {

	public int i=10;
	public int j=10;
	public int math(int i,int j)
	{
		return i*j;
	}
	public void ppmethod() {
		System.out.println("Inside pp method");
	}
	public static void main(String[] args) 
	{
		PublicPractice pp=new PublicPractice();
		System.out.println("The value of i is.."+pp.i);
		System.out.println("The value of j is.."+pp.j);
		System.out.println("The value of i*j is.."+pp.math(pp.i,pp.j));
	}

}
