package com.javaiopractice;

import java.io.FileOutputStream;

public class WriteTotxtUsingOutputStream {

	public static void main(String[] args) 
	{
		try
		{
			FileOutputStream f=new FileOutputStream("C:\\Users\\Hp\\Desktop\\wfh.txt");
			String s="I lost my data in txt file that is already existing...";
			byte b[]=s.getBytes();
		f.write(b);
		}
		catch(Exception e)
		{
			System.out.println("sucess..");
		}
		
	}

}
