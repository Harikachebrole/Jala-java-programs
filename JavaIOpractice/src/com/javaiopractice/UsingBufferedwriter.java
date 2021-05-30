package com.javaiopractice;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class UsingBufferedwriter {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("C:\\Users\\Hp\\Desktop\\wfh.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			fw.write("On the way to complete the jala assignments...");
			fw.close();
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("success..");
		}

	}
}
