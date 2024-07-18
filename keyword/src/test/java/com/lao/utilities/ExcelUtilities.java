package com.lao.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilities {
	XSSFSheet sheet;
	FileInputStream file;
	XSSFWorkbook workbook;
	XSSFCell cell;
	public void readExcelFile(String location) throws IOException {
	
		
		 file= new FileInputStream(location);
	
		
		 workbook= new XSSFWorkbook(file);
		
		 sheet = workbook.getSheet("Sheet1");
		
		
	}public String getValuesFromExcel(int row,int column) {
		
		 cell = sheet.getRow(row).getCell(column);
		String cellValue = cell.getStringCellValue();
		
		System.out.println(cellValue);
		return cellValue;
		
	}
	
	
	
	
	
}
