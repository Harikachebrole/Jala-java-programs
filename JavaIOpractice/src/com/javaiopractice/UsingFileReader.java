package com.javaiopractice;

import java.io.FileInputStream;
import java.io.FileReader;

public class UsingFileReader {

	public static void main(String[] args) 
	{
		try
		{
		//FileInputStream f=new FileInputStream("C:\\Users\\Hp\\Desktop\\wfh.txt");
		FileReader fr=new FileReader("C:\\Users\\Hp\\Desktop\\wfh.txt");
		int i;
		while((i=fr.read())!=-1)
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
