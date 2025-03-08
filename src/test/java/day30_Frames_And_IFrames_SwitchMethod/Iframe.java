package day30_Frames_And_IFrames_SwitchMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
	/*	
		//Iframe 1
		WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"id1\"]/div/input")).sendKeys("Hi How are you");
		driver.switchTo().defaultContent();
		*/
		
		//Iframe3
		WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		Thread.sleep(3000);
		WebElement frame33=driver.findElement(By.xpath("/html/body/center/iframe"));
		driver.switchTo().frame(frame33);
		Thread.sleep(3000);
	   // driver.findElement(By.xpath("//*[@id=\"i8\"]/div[3]/div")).click();
		
		driver.findElement(By.xpath("(//*[@class='AB7Lab Id5V1'])[3]")).click();
	    System.out.println("finised programme...");
	    driver.switchTo().defaultContent();
	 
		
		
		
		
	}

}