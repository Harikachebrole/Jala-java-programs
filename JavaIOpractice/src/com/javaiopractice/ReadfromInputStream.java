package com.javaiopractice;

import java.io.FileInputStream;

public class ReadfromInputStream {

	public static void main(String[] args) {
		/*
		 * try {
		 * 
		 * FileInputStream f = new FileInputStream("C:\\Users\\Hp\\Desktop\\wfh.txt");
		 * int i=f.read(); System.out.println((char)i); f.close(); }
		 */// single char print
		try {
			FileInputStream f = new FileInputStream("C:\\Users\\Hp\\Desktop\\wfh.txt");
			int i = 0;
			while ((i = f.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}