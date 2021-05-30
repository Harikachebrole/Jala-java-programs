package com.practicepublic;

public class PublicPractice1 extends PublicPractice
{

	public static void main(String[] args) 
	{
		PublicPractice1 pp1=new PublicPractice1();
		System.out.println("The value of i is.."+pp1.i);
		System.out.println("The value of j is.."+pp1.j);
		System.out.println("The value of i*j is.."+pp1.math(pp1.i,pp1.j));

	}

}
