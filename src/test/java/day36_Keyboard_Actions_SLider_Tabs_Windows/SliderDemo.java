package day36_Keyboard_Actions_SLider_Tabs_Windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		
		//min slider
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		WebElement min_Slider=driver.findElement(By.xpath("//div[@id='slider-range']//span[1]"));
		System.out.println("slider old Locatin: "+min_Slider.getLocation());  //current location (59, 289)
		
		act.dragAndDropBy(min_Slider, 150,289).perform();	
		
		System.out.println("slider new Locatin: "+min_Slider.getLocation());  //current location (209, 289)
		
		
		//max slider
		
		WebElement max_Slider=driver.findElement(By.xpath("//div[@class='price-range-block']//span[2]"));
		System.out.println("max slider old Locatin: "+max_Slider.getLocation());  //current location (544, 289)
		
		act.dragAndDropBy(max_Slider, -100,289).perform();	
		
		System.out.println("max slider new Locatin: "+max_Slider.getLocation());  //current location (442, 289)
		
		
	}

}
