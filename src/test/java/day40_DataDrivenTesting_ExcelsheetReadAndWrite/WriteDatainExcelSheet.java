package day40_DataDrivenTesting_ExcelsheetReadAndWrite;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDatainExcelSheet {

	public static void main(String[] args) throws IOException 
	{
		//Excel file --->workbook--->sheets--->Rows--->cells
		
		FileOutputStream file=new FileOutputStream("C:\\Workspaces\\30-10-2024 On words\\Selenium_SDET_Daywise_Practice\\Excelsheet\\myFile.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet1=workbook.createSheet();
		
		XSSFRow Row1=sheet1.createRow(0);
		Row1.createCell(0).setCellValue("CourseName");
		Row1.createCell(1).setCellValue("course");
		Row1.createCell(2).setCellValue("fees");
		
		XSSFRow Row2=sheet1.createRow(1);
		Row2.createCell(0).setCellValue("Java");
		Row2.createCell(1).setCellValue("pro java Advance");
		Row2.createCell(2).setCellValue("15000");
		
		workbook.write(file);
		workbook.close();
		System.out.println("Write data in excel sheet is completed....");
	}

}
