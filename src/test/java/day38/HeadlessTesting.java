package day38;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTesting {

	public static void main(String[] args) 
	{
		
		//headless testing
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless=new"); //setting for headless testing
		
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		
		System.out.println("Test is passed");
		
		
		
		
		

	}

}
