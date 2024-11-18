package day47;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage1 
{
	
	WebDriver driver;
	
	//Constructor
	LoginPage1(WebDriver driver)
	{
		this.driver=driver;	
	}
	
	//locators
	
	By txt_Username_loc=By.xpath("//input[@placeholder='Username']");
	By txt_Password_loc=By.xpath("//input[@placeholder='Password']");
	By btn_Login_loc=By.xpath("//button[normalize-space()='Login']");
	
	//Action methods
	public void setUsername(String username) 
	{
		driver.findElement(txt_Username_loc).sendKeys(username);
	}
	
	public void setPass(String password) 
	{
		driver.findElement(txt_Password_loc).sendKeys(password);
	}
	
	public void click_OnLogin() 
	{
		driver.findElement(btn_Login_loc).click();
	}

}
