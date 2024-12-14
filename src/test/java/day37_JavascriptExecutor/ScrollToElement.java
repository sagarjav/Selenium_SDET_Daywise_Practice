package day37_JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement section1=driver.findElement(By.cssSelector("#input1"));
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		//move to element section1
		js.executeScript("arguments[0].scrollIntoView()", section1);
		Thread.sleep(2000);
	}

}
