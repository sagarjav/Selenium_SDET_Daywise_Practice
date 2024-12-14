package day40_DataDrivenTesting_ExcelsheetReadAndWrite;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelSheetData {

	public static void main(String[] args) throws IOException 
	{
		
		//Excel file --->workbook--->sheets--->Rows--->cells
		FileInputStream file=new FileInputStream("C:\\Workspaces\\30-10-2024 On words\\Selenium_SDET_Daywise_Practice\\Excelsheet\\Readexceldata.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		XSSFSheet sheet1= workbook.getSheet("Sheet1");
		
		int totalRows=sheet1.getLastRowNum();   //3
		System.out.println("Total rows in sheet: "+ totalRows);
		
		int totalCells=sheet1.getRow(1).getLastCellNum();
		System.out.println("Total Cells in sheet: "+ totalCells);
		
		for(int r=0; r<=totalCells; r++) //rows counting from 0    //cells counting from 1
		{
			XSSFRow currentRow=sheet1.getRow(r);
			
			for(int c=0; c<totalCells; c++)    //cells counting from 1
			{
				XSSFCell currentcell=currentRow.getCell(c);
				System.out.print(currentcell.toString()+" ");
				
			}
			
			System.out.println(" ");
		}
		
		workbook.close();
	}

}
