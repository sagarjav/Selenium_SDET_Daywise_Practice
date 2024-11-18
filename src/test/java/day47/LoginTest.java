package day47;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {

	WebDriver driver;
	@BeforeClass
	void setup() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	 @Test
	    void testLogin() throws InterruptedException 
	    {
		     //LoginPage lp=new LoginPage(driver);
		     
		     LoginPage2 lp=new LoginPage2(driver);
		     lp.setUsername("Admin");
		     lp.setPass("admin123");
		     lp.click_OnLogin();
		     
		     Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	    }
	    
	    @AfterClass
	    void tearDown() 
	    {
	        driver.quit();
	    }
}
