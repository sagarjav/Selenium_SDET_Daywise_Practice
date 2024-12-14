package day37_JavascriptExecutor;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PointClassdemo {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		Point p=new Point(100,50);
	   driver.manage().window().setPosition(p);
	   

	}

}
