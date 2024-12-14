package day35_Mouse_Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MoveToElement {
	
	public static void main(String [] args) 
	{
		System.setProperty("webdriver.chromedriver.driver", "C:\\Workspaces\\30-10-2024 On words\\Selenium_SDET_Daywise_Practice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nseindia.com/");
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		
		
	WebElement NseAcademy=driver.findElement(By.xpath("//div[@class='foot-col foot-nav']//a[normalize-space()='NSE Academy']"));
		
	  Actions act=new Actions(driver);
		act.moveToElement(NseAcademy);
		
	}
}
