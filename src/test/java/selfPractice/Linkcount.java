package selfPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Test Case
 * 1) Launch browser
 * 2) open URL
 * 3) Validate title should be 
 * 4)close browser
 * 
 */

public class Linkcount {

	public static void main(String[] args) throws InterruptedException {
		
		//ChromeDriver driver=new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver", "E:\\New Software Testing\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		       int count=0;
				
				
				for(WebElement link:links)
				{
				   String str= link.getAttribute("href");

				   count++;

				}

				System.out.println("linkcount: "+count);
		
		
		
		driver.close();
		

	}

}
