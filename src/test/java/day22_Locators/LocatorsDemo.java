package day22_Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\New Software Testing\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://www.demoblaze.com/");
		
		//name 
		//boolean nameHome=driver.findElement(By.name("Home")).isDisplayed();
		//System.out.println(nameHome);
		
		//id
		String idName=driver.findElement(By.id("login2")).getText();
		System.out.println(idName);
		
		//LinkText
		String LinktextName=driver.findElement(By.linkText("Samsung galaxy s6")).getText();
		System.out.println(LinktextName);
		
		//className
		List<WebElement> headerlinks=driver.findElements(By.className("nav-item"));
		System.out.println("Header name size: "+headerlinks.size());
		
		//TagName
		List<WebElement> tagheaderlinks=driver.findElements(By.tagName("a"));
		System.out.println("Header tag name size: "+tagheaderlinks.size());
		
		driver.quit();
		
		
		
	}

}
