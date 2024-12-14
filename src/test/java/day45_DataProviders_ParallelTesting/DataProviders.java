package day45_DataProviders_ParallelTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {
	
	WebDriver driver;
	
	@BeforeClass
	void setup() 
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	
	@Test(dataProvider="DP")
	void testLogin(String user,String pass) throws InterruptedException 
	{
		driver.findElement(By.xpath("//input[@placeholder='Username']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(user);
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pass);
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		Thread.sleep(3000);
		boolean admin=driver.findElement(By.xpath("//img[@class='oxd-userdropdown-img']")).isDisplayed();
	    System.out.println("admin Status: "+ admin);
		Assert.assertTrue(admin);
	
	}
	
	@AfterClass
	void tearDown() 
	{
		driver.quit();
	}
	
	@DataProvider(name="DP")
	Object[][] loginData() 
	{
		Object data[][]= { {"wrongadmin", "admin123"},
				           {"Admin", "wrongpass"},
				           {"Admin", "admin123"}
		                   };
		return data;
	}
	

}
