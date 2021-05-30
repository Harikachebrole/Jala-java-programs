//Write two methods with the same name but different number of parameters of different
//data type and call the methods from main method
package com.methodoverloading;
public class Methodoverloading2 {
	public String name(String x)
	{
		return x;
	}
	public void name(int id,int marks)
	{
		System.out.println("marks of the student..."+marks);
		System.out.println("Id of the student.."+id);
	}

	public static void main(String[] args) 
	{
		Methodoverloading2 m2=new Methodoverloading2();
		System.out.println("name of the student...."+m2.name("Java Student"));
		m2.name(10,555);
	
	}

}
