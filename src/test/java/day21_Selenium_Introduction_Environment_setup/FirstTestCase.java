package day21_Selenium_Introduction_Environment_setup;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Test Case
 * 1) Launch browser
 * 2) open URL
 * 3) Validate title should be 
 * 4)close browser
 * 
 */

public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {
		
		//ChromeDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "E:\\New Software Testing\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.demoblaze.com/");
		//driver.get("https://www.opencart.com/");
		
		String act_title=(driver.getTitle());
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		if(act_title.equals("STORE")) 
		{
			System.out.println("Test is passed");
		}
		else 
		{
			System.out.println("Test is failed");
		}
		driver.close();
		

	}

}
