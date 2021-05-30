package com.javaiopractice;

import java.io.FileReader;
import java.util.Properties;

public class Readfromproperties {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("C:\\Users\\Hp\\proper.properties");
			Properties p = new Properties();
			p.load(fr);
			System.out.println(p.getProperty("username"));
			System.out.println(p.getProperty("password"));
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("success..");
		}
	}
}
