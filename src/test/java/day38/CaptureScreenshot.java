package day38;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenshot {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		
		//Full page screenshot
		TakesScreenshot ts= (TakesScreenshot)driver;       //TakesScreenshot ts=driver;
		
		File sourcefile=ts.getScreenshotAs(OutputType.FILE);
		
		File targetfile=new File("C:\\Workspaces\\30-10-2024 On words\\Selenium_SDET_Daywise_Practice\\screenshot\\fullpage.png");
		
		FileHandler.copy(sourcefile, targetfile);
		

	}

}
