package com.thissuper;

public class TestthisAndsuper2 extends Thissuper1 {

	int yz ;
	
	public TestthisAndsuper2(int l)
	{
		super(l,10);
		
		
		System.out.println("Inside TestthisAndsuper2 Constrctor 1 parameter " + l);
	}

	public static void main(String[] args) {

		TestthisAndsuper2 ta2 = new TestthisAndsuper2(20);
		
		
	}

}
