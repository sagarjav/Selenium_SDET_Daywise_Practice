package day47;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 
{
	
	WebDriver driver;
	
	//Constructor
	LoginPage2(WebDriver driver)
	{
		this.driver=driver;	
		PageFactory.initElements(driver, this);
	}
	
	//locators
	
	//@FindBy(xpath="//input[@placeholder='Username']") 
	//WebElement txt_Username;
	
	@FindBy(how=How.XPATH, using="//input[@placeholder='Username']") 
	WebElement txt_Username;
	
	@FindBy(xpath="//input[@placeholder='Password']") 
	WebElement txt_Password;
	
	@FindBy(xpath="//button[normalize-space()='Login']") 
	WebElement btn_Login;
	
	
	//Action methods
	public void setUsername(String username) 
	{
		txt_Username.sendKeys(username);
	}
	
	public void setPass(String password) 
	{
		txt_Password.sendKeys(password);
	}
	
	public void click_OnLogin() 
	{
		btn_Login.click();
	}

}
