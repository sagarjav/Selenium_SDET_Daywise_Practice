package day38_Screenshot_Headless_SSL_AdExtentions;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenshotSpecificElement {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		
		//specific page section screenshot
		
		WebElement header=driver.findElement(By.xpath("//body//header"));
		
		File sourcefile=header.getScreenshotAs(OutputType.FILE);
		
		File targetfile=new File("C:\\Workspaces\\30-10-2024 On words\\Selenium_SDET_Daywise_Practice\\screenshot\\sectionpage.png");
		
		FileHandler.copy(sourcefile, targetfile);
		
		driver.quit();

	}

}
