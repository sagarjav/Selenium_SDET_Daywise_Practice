package day42_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/*
 * open app
 * login app
 * logout app
 * close app
 */
public class OrangeHRMTest {
    WebDriver driver;
   
    @Test(priority = 0)
    void setup() {
    	driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    void openapp() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @Test(priority = 2)
    void Loginapp() {
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
    }

    @Test(priority = 3)
    void logoutapp() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
    }

    @Test(priority = 4)
    void closeapp() throws InterruptedException {
        Thread.sleep(3000);
        boolean logoVisible = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
        System.out.println("--Logo is visible-- " + logoVisible);
    }

    @Test(priority = 5)
    void tearDown() {
        driver.quit();
    }
}
