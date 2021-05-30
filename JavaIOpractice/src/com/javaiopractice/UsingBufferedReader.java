package com.javaiopractice;

import java.io.BufferedReader;
import java.io.FileReader;

public class UsingBufferedReader {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("C:\\Users\\Hp\\Desktop\\wfh.txt");
			BufferedReader br = new BufferedReader(fr);
			int i;
			while ((i = fr.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("success..");
		}

	}

}
