package day35_Mouse_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		
		WebElement Desktop=driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		
		Actions act=new Actions(driver);
		
		//Move to element
		act.moveToElement(Desktop).build().perform();
		
		//right click on element
		act.contextClick(Desktop).perform();
		
		//double click on element
		act.doubleClick(Desktop).perform();
		

		//drag and drop
		
		
		
	}

}
