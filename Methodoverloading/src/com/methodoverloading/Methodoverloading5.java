package com.methodoverloading;

public class Methodoverloading5 {
	/*public  int common(int x,int y)
		{
		return x+y;
			System.out.println("It is not possible");
		}*/
		public int common(int x,int y)
		{
				return x-y;
			
		}

	public static void main(String[] args) 
	{
		Methodoverloading5 m5=new Methodoverloading5();
		System.out.println("invalid case having different return type ans same no of elements and datatype ...");
		System.out.println(m5.common(10, 5));
	}

}
