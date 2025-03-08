package day36_Keyboard_Actions_SLider_Tabs_Windows;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://text-compare.com/");
		driver.findElement(By.cssSelector("#inputText1")).sendKeys("hello sagar very nice");
		
		Actions act=new Actions(driver);
		
		//ctrl+A
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
         
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		
		//ctrl+V
		driver.findElement(By.cssSelector("#inputText2")).click();
		
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
		
		
		
		
		
		
	}

}
