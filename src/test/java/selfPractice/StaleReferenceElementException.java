package selfPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleReferenceElementException {

	public static void main(String[] args) throws InterruptedException 
	{
		//System.setProperty("webdriver.chrome.driver", "E:\\New Software Testing\\Driver\\chromedriver-win64\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.demoblaze.com/");
		
		WebElement cart=driver.findElement(By.xpath("//*[@class='navbar-nav ml-auto']/li[1]/following-sibling::*[3]"));
		cart.click();
		Thread.sleep(3000);
		driver.navigate().back();
		//Handle StaleElementReferenceException
		try 
		{
		cart.click();
		}
		catch(StaleElementReferenceException e)
		{
			cart=driver.findElement(By.xpath("//*[@class='navbar-nav ml-auto']/li[1]/following-sibling::*[3]"));
			
			cart.click();
		}

	}

}
