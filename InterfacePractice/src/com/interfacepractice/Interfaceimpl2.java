package com.interfacepractice;

public class Interfaceimpl2 implements Interface2
{

	public void i21()
	{
		System.out.println("implementing one method in a class");
	}
	public void i22() 
	{
		
	}

	public static void main(String[] args) 
	{
		Interface2 in2=new Interfaceimpl2();//Use Interface instances to call the
		//implemented method in the implemented class
		in2.i21();
		
		Interfaceimpl2 i2=new Interfaceimpl2();
		i2.i21();
	}

}
