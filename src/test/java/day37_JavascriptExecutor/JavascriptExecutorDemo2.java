package day37_JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorDemo2 
{

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement name=driver.findElement(By.xpath("//input[@id='name']"));
		
		JavascriptExecutor js= (JavascriptExecutor) driver; //JavascriptExecutor js=driver;

		System.out.println("--Start the java scrolling---");
		
		// down --> 2nd parameter +ve value
		js.executeScript("window.scrollBy(0,1500)");
		Thread.sleep(3000);
		
		// up --> 2nd parameter -ve value
		js.executeScript("window.scrollBy(0,-1500)");
		Thread.sleep(3000);
		
		// right --> 1st parameter +ve value
		js.executeScript("window.scrollBy(1000,0)");
		Thread.sleep(3000);
		
		// left --> 1st parameter -ve value
		js.executeScript("window.scrollBy(-500,0)");
		Thread.sleep(3000);
		System.out.println("--end the java scrolling---");
	}
}
