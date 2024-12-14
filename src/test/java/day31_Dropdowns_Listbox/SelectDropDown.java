package day31_Dropdowns_Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement countrydrop=driver.findElement(By.xpath("//select[@id='country']"));
		
        Select drop=new Select(countrydrop);
        
        //Select option from the drop down
        drop.selectByVisibleText("Canada");
        
        //select by value
        drop.selectByValue("canada");
        
        //select by index
        drop.selectByIndex(4);
        
        List <WebElement> alloptions=drop.getOptions();
        
        System.out.println("No of options: "+ alloptions.size());
        
        //printing country options
        for(int i=0; i<alloptions.size(); i++)
        {
        	System.out.println(alloptions.get(i).getText());
        }
        
	}

}
