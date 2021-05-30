//Write two methods with the same name and same number of parameters of same type
//and call from main method
package com.methodoverloading;

public class Methodoverloading3 {
	//public void common(int x,int y)
	//{
	//	//System.out.println("It is not possible");
	//}
	public void common(int x,int y)
	{
		System.out.println("invalid case...");
	}

	public static void main(String[] args) 
	{
		Methodoverloading3 m3=new Methodoverloading3();
		m3.common(10, 10);

	}

}
