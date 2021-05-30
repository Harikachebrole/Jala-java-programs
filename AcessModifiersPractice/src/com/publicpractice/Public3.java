package com.publicpractice;

import com.practicepublic.PublicPractice;

public class Public3 extends PublicPractice
{

	public static void main(String[] args) 
	{
		Public3 p3=new Public3();
		System.out.println("The value of i is.."+p3.i);
		System.out.println("The value of j is.."+p3.j);
		System.out.println("The value of i*j is.."+p3.math(p3.i,p3.j));


	}

}
