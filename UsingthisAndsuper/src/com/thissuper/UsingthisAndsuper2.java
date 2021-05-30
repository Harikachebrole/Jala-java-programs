package com.thissuper;

public class UsingthisAndsuper2 extends UsingthisAndsuper1
{
	
	public UsingthisAndsuper2()
	{
		super.i=i;
		super.j=j;
		System.out.println("child class Two parameterized constructor printing values "+i);
		System.out.println("child class Two parameterized constructor printing values "+j);
	}
		/*public UsingthisAndsuper2(int k)
		{
			super(k,200);
			System.out.println("child class Two parameterized constructor printing values "+super.i);
			System.out.println("child class Two parameterized constructor printing values "+super.j);

		}*/
		
	
	public static void main(String[] args)
	{
		UsingthisAndsuper2 t2=new UsingthisAndsuper2();
		
		
	}

}
