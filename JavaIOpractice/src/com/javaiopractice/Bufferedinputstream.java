package com.javaiopractice;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Bufferedinputstream {

	public static void main(String[] args)
	{
		try
		{
		FileInputStream f=new FileInputStream("C:\\Users\\Hp\\Desktop\\wfh.txt");
		BufferedInputStream b=new BufferedInputStream(f);
		int i;
		while((i=f.read())!=-1)
		{
			System.out.print((char)i);
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
