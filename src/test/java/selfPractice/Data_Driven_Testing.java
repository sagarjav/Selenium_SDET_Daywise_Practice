package selfPractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/*
 * 1.read data from excel sheet
 * store data in data provider
 * insert data in website login page
 */
public class Data_Driven_Testing 
{
	
	
	@DataProvider(name="dataread1")
	Object [][] read_Excel_data() throws IOException 
     {
		
	      Object final_data[][];
		
		
    	 FileInputStream file= new FileInputStream("C:\\Users\\omsai\\Desktop\\DataDriven_Orangehrmlive.xlsx");
    
       XSSFWorkbook wb=new XSSFWorkbook(file);
       XSSFSheet  sheetnum= wb.getSheet("Sheet1");
      int RowNumber=sheetnum.getPhysicalNumberOfRows();
      int GetCellnum=sheetnum.getRow(0).getPhysicalNumberOfCells();
     
      System.out.println("total number of Rows: "+RowNumber);
      System.out.println("total number of cells: "+GetCellnum);
      
      final_data=new Object[RowNumber-1][GetCellnum];
      
      System.out.println("<--------Space--------->");
      
      for(int i=1; i<RowNumber; i++)
      {
    	  for(int c=0; c<GetCellnum; c++) 
    	  {
    		  String Data=sheetnum.getRow(i).getCell(c).getStringCellValue();
    		  System.out.print(Data+" ");
    		
    		  //String to 2 D array convert
    		  final_data[i-1][c]=Data;
    	  }
    	  System.out.println();
      }
      return final_data;
      
     }
	@Test  (dataProvider="dataread1")
	void testWebsite(String user,String pass) throws InterruptedException 
	{
		 WebDriver driver=null;
		try 
		{
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
				
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				
				WebElement user1=driver.findElement(By.xpath("//input[@placeholder='Username']"));
				wait.until(ExpectedConditions.visibilityOf(user1)).sendKeys(user);
				
				WebElement pass1=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		        wait.until(ExpectedConditions.visibilityOf(pass1)).sendKeys(pass);
					
		        WebElement login=driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		        wait.until(ExpectedConditions.visibilityOf(login)).click();
		  }
		catch(Exception e) 
		{
			System.out.println("Exception type: "+e.getMessage());
		}
		 finally 
			{
				driver.quit();
			}
				
				
	}
}
