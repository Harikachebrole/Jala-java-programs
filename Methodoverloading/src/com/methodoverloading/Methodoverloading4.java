package com.methodoverloading;

public class Methodoverloading4 {
	public void common(String x,String y)
		{
			System.out.println("java application in method overloading");
		}
		public void common(int x,int y)
		{
			System.out.println("valid case...");
		}

	public static void main(String[] args) 
	{
		Methodoverloading4 m4=new Methodoverloading4();
		m4.common(10, 30);
		m4.common("java","application");
		

	}

}
