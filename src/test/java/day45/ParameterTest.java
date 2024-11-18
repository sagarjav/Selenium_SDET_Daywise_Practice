package day45;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
    
    WebDriver driver;
    
    @BeforeClass
    @Parameters({"browser"})  // Correct annotation for TestNG parameter
    void setup(String br) 
    {
        // Initializing the driver based on the browser parameter
        switch(br.toLowerCase()) 
        {
            case "chrome": driver = new ChromeDriver();  break;
               
            case "edge": driver = new EdgeDriver();   break;
          
                
            case "firefox": driver = new FirefoxDriver();   break;
          
                
            default: System.out.println("browser is invalid");
                
        }
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    
    @Test
    void testLogin() throws InterruptedException 
    {
        // Entering static login details for testing
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        
        Thread.sleep(3000);
        boolean admin = driver.findElement(By.xpath("//img[@class='oxd-userdropdown-img']")).isDisplayed();
        System.out.println("Admin Status: " + admin);
        Assert.assertTrue(admin, "Login was unsuccessful");
    }
    
    @AfterClass
    void tearDown() 
    {
        driver.quit();
    }
}
