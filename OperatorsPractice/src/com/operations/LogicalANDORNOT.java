package com.operations;

public class LogicalANDORNOT 
{

	public static void main(String[] args)
	{
		LogicalANDORNOT bool=new LogicalANDORNOT();
		boolean a=true;
		boolean b=false;
		System.out.println("logical AND:.."+bool.logicand(a,b));
		System.out.println("logical OR:.."+bool.logicor(a,b));
		System.out.println("logical NOT:.."+bool.logicnot(a,b));
	}
public boolean logicand(boolean a, boolean b)
{
	return a&&b;
}
public boolean logicor(boolean a, boolean b)
{
	return a||b;
}
public boolean logicnot(boolean a, boolean b)
{
	return !(a&&b);
}}
