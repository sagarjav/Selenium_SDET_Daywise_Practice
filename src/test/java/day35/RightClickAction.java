package day35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		
		WebElement Desktop=driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		
		Actions act=new Actions(driver);
		
		//right click on element
		act.contextClick(Desktop).perform();
		
		

	}

}
