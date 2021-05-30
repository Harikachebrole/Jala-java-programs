package com.interfacepractice;

public class interfaceImpl implements InterfacePractice
{
	public void i1()
	{
		System.out.println("class implements interface..");
	}
	
public static void main(String[] args)
{
	interfaceImpl fi=new interfaceImpl();
	fi.i1();
}
}
