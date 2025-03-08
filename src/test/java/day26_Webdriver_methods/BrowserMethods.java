package day26_Webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.close();     //close only single browser
		
		//driver.quit();    //close all browser open
		
		
	}

}
