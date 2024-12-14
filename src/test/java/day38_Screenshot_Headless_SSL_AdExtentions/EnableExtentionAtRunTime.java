package day38_Screenshot_Headless_SSL_AdExtentions;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EnableExtentionAtRunTime 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions options=new ChromeOptions();
		File file=new File("C:\\Workspaces\\30-10-2024 On words\\Selenium_SDET_Daywise_Practice\\crx\\SelectorsHub-XPath-Helper-Chrome-Web-Store.crx"); //path of extention crx file
		options.addExtensions(file);
		
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		
		System.out.println("Test is passed");
		

		Thread.sleep(5000);
		driver.quit();
		

	}

}
