package com.interfacepractice;

interface Moveable
{
 	int AVGSPEED = 40;
 	void move();
}

class Vehicle implements Moveable
{
 	public void move()
 	{
  		System.out.println ("Average speed is"+AVGSPEED);
 	}
 	public static void main (String[] arg)
 	{
  		Vehicle vc = new Vehicle();
  		vc.move();
 	}
}