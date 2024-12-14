package day29_CheckBoxHandle_AND_AlertHandle;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        //simple alert
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		
		Alert myalert=driver.switchTo().alert();
		myalert.accept();
		
		Thread.sleep(5000);
		
		//confirm Alert
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Alert Special_alert=driver.switchTo().alert();
		System.out.println(Special_alert.getText());
		Special_alert.accept();
		
		Thread.sleep(5000);
		//prompt alert
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Alert prompt=driver.switchTo().alert();
		prompt.sendKeys("Nice");
		prompt.accept();
		
		System.out.println(driver.findElement(By.xpath("//p[@id='result']")).getText());
		
		
	}

}
