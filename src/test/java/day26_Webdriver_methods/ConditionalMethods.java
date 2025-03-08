package day26_Webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//isDisplayed
		Thread.sleep(3000);
		WebElement Logo=driver.findElement(By.xpath("//img[@alt='company-branding']"));
		boolean LogoStatus=Logo.isDisplayed();
		System.out.println(LogoStatus);
		
		//isEnabled
		//isSelected
		
		driver.quit();
		
		
	
	
	
	}

}
