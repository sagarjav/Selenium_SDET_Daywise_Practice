package day28_Navigational_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigational_Commands_Methods_01 {
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
		WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("Admin");
		
		Thread.sleep(3000);
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("admin123");
		
		Thread.sleep(3000);
		WebElement loginButton=driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
		loginButton.click();
		Thread.sleep(3000);
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.navigate().forward();
		
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		
		
		
		
		
	}

}
