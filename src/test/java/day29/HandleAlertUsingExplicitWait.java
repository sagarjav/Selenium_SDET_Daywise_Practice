package day29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAlertUsingExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(10)); //declarations
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
       
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		
		Alert A1=mywait.until(ExpectedConditions.alertIsPresent());
		A1.accept();
	}

}
