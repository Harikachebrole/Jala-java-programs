package com.exception;

import java.sql.Connection;
import java.sql.SQLException;

public class Exception18 {

	public static void main(String[] args) {
		try {
			throw new SQLException();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
