package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Workspaces\\30-10-2024 On words\\Selenium_SDET_Daywise_Practice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://www.demoblaze.com/");
		
		//Xpath with single attribute
		
		driver.findElement(By.xpath("//li[@class='nav-item active']")).click();
		
		//Xpath with multiple attributes
		String xpathName=driver.findElement(By.xpath("//a[@id='itemc'] [@class='list-group-item'][text()='Phones']")).getText();
		System.out.println("Xpath with multiple attributes: "+ xpathName);
		
		//xpath with and operator
		String xpathName2=driver.findElement(By.xpath("//a[@id='itemc'and @class='list-group-item'][text()='Phones']")).getText();
		System.out.println("xpath with and operator: "+xpathName2);
		
		//Xpath with inner text
		String xpathName3=driver.findElement(By.xpath("//a[text()='Laptops']")).getText();
		System.out.println("Xpath with inner text: "+xpathName3);
		
		//Xpath with contains
		String xpathName4=driver.findElement(By.xpath("//a[contains(@class,'list-group-item')][1]")).getText();
		System.out.println("Xpath with contains: "+xpathName4);
		
		//Xpath with Start with
		String xpathName5=driver.findElement(By.xpath("//a[starts-with(@class,'list')][1]")).getText();
		System.out.println("Xpath with Start with: "+xpathName5);
		
		driver.quit();
		

	}

}
