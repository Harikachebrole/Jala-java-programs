package com.javaiopractice;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) {
		try {
			FileInputStream f = new FileInputStream(new File("C:\\Users\\Hp\\Desktop\\New folder\\Occupation.xlsx"));

			XSSFWorkbook wb = new XSSFWorkbook(f);
			XSSFSheet sheet = wb.getSheetAt(0);

			Iterator<Row> row = sheet.iterator();
			while (row.hasNext()) {
				Row rows = row.next();
				Iterator<Cell> cell = rows.cellIterator();
				while (cell.hasNext()) {
					Cell cells = cell.next();
					switch (cells.getCellType()) {
					case NUMERIC:
						System.out.print(cells.getNumericCellValue() + "\t\t\t");
						break;
					case STRING:
						System.out.print(cells.getStringCellValue() + "\t\t\t\t");
						break;
					}

				}
				System.out.println();
			}

		} catch (Exception e) {
			System.out.println(e);
			System.out.println("success..");
		}
	}
}