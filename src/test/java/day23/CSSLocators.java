package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Workspaces\\30-10-2024 On words\\Selenium_SDET_Daywise_Practice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://www.demoblaze.com/");
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//tag id
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T shirt");
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T shirt");
		
		//tag class
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T shirt");
		
		Thread.sleep(5000);
		//tag attribute
		boolean LogoisDisplayed=driver.findElement(By.cssSelector("a[class='navbar-brand']")).isDisplayed();
		System.out.println(LogoisDisplayed);
		
		//Thread.sleep(5000);
		//tag class attribute
		String tagname=driver.findElement(By.cssSelector("a.list-group-item[id='cat']")).getText();
		System.out.println(tagname);

		driver.quit();
	}

}
