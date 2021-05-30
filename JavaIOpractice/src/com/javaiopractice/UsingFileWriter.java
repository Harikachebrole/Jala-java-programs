package com.javaiopractice;

import java.io.FileWriter;

public class UsingFileWriter {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("C:\\Users\\Hp\\Desktop\\wfh.txt");
			fw.write("jala technology assignments");
			fw.close();

		} catch (Exception e) {
			System.out.println("success..");
		}

	}
}
