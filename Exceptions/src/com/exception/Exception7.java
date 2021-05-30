package com.exception;

public class Exception7 {

	public static void main(String[] args)
	{
		 try
		 {  
			   int data=25/0;  
			   System.out.println(data);  
			  }  
			  catch(Exception e)
		 {
				  e.printStackTrace();
				  System.out.println(e);
		 }  
			  finally{System.out.println("finally block  executed");}  

	}

}
