package day26_Webdriver_methods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//get title
		System.out.println(driver.getTitle());
		
		//Get current url
		System.out.println(driver.getCurrentUrl());
		
		//Get current URL
	    System.out.println(driver.getCurrentUrl());
				
		//Get window handle
	    System.out.println(driver.getWindowHandle());
	    
	    //Get window handles
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//a[@href='https://www.linkedin.com/company/orangehrm/mycompany/']//*[name()='svg']")).click();
	    Set<String>  winID= driver.getWindowHandles();
	    System.out.println("multiple id: "+ winID);
	    
	}

}
