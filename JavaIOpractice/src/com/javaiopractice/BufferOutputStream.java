package com.javaiopractice;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferOutputStream {

	public static void main(String[] args) throws Exception
	{
		try
		{
			FileOutputStream fout=new FileOutputStream("C:\\Users\\Hp\\Desktop\\wfh.txt");
			BufferedOutputStream bout =new BufferedOutputStream(fout);
			String s="how can i get it back..";
			byte b[]=s.getBytes();
			fout.write(b);
		}
catch(Exception e)
		{
	System.out.println(e);
		}
	}

}
