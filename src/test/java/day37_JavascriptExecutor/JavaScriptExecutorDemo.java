package day37_JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement name=driver.findElement(By.xpath("//input[@id='name']"));
		
		JavascriptExecutor js= (JavascriptExecutor) driver; //JavascriptExecutor js=driver;

		js.executeScript("arguments[0].click()", name);
		
		//scroll to element
		js.executeScript("scroll(0,3000)");
		
		
		
	}

}
