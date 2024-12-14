package day41_UtilityFiles_PropertiesFileUse;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GrowwCalculator {
	
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://groww.in/calculators/compound-interest-calculator");
	 
        String file="C:\\Workspaces\\30-10-2024 On words\\Selenium_SDET_Daywise_Practice\\Day41_DDT\\CompundInterestData.xlsx";
     int totalrow=ExcelUtils.getRowCount(file, "Sheet1"); 
      for(int r=1; r<=totalrow; r++)
      {
    	  //1read data
    	String PA=ExcelUtils.getCellData(file, "Sheet1", r, 0);
      	System.out.println(PA);
      	String ROI=ExcelUtils.getCellData(file, "Sheet1", r, 1);
      	System.out.println(ROI);
      	String Period=ExcelUtils.getCellData(file, "Sheet1", r, 2);
      	System.out.println(Period);
      	//String Freq=ExcelUtils.getCellData(file, "Sheet1", r, 3);
      	String Expected=ExcelUtils.getCellData(file, "Sheet1", r, 3).replace(",", "");
      	//System.out.println(PA+ROI+Period+Expected);
    	  
      	//2 data use in website calclator
      	WebElement prel=driver.findElement(By.xpath("//*[@id=\"PRINCIPAL_AMOUNT\"]"));
    	prel.clear();
    	Thread.sleep(3000);
    	prel.sendKeys(PA);
    	
    	WebElement RateIn=driver.findElement(By.xpath("//input[@id='RATE_OF_INTEREST']"));
    	RateIn.clear();
    	Thread.sleep(3000);
    	RateIn.sendKeys(ROI);
    	
    	WebElement Duration=driver.findElement(By.xpath("//input[@id='TIME_PERIOD']"));
    	Duration.clear();
    	Thread.sleep(3000);
    	Duration.sendKeys(Period);
    	Thread.sleep(3000);
    	 
    	//3 verify data
    	WebElement ca=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/div[1]/div[1]/div/div[1]/table//tr[3]//td[2]"));
    	String Actual=ca.getText().replace(",", "").replace("₹", "");
    	ExcelUtils.setCellData(file, "Sheet1", r, 4, Actual);
    
    	if(Double.parseDouble(Expected)==Double.parseDouble(Actual))
    	{
    		System.out.println("Test is Passed");
    		Thread.sleep(3000);
    		ExcelUtils.setCellData(file, "Sheet1", r, 7, "Pass");
    		System.out.println("= = = = = = = = = = = = = = = =");
    		
    	}
    	else
    	{
    		System.out.println("Test is Failed");
    		Thread.sleep(3000);
    		ExcelUtils.setCellData(file, "Sheet1", r, 7, "Failed");
    		System.out.println("= = = = = = = = = = = = = = = =");
    	}
    	driver.navigate().refresh();
        Thread.sleep(3000);
    	
    	
      }//loop complete
      
      driver.close();
   }
	
	
}