package day31_Dropdowns_Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxDemo1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement countrydrop=driver.findElement(By.xpath("//select[@id='country']"));

	   Select s=new Select(countrydrop);
	   
	  //<option value="usa">United States </option>
	  
	   // 1. SelectByIndex() void
	   s.selectByIndex(4);
	   Thread.sleep(3000);
	   //2. SelectByValue() void
	   s.selectByValue("china");
	   Thread.sleep(3000);
	   //3. SelectByVisibleText() void
	   s.selectByVisibleText("Australia");
	   Thread.sleep(3000);
	   // 4. DeselectByIndex() void
	  try { 
		  s.deselectByIndex(5);
		  }
	  catch(Exception e) 
		  {
			  System.out.println("exception is :  "+e.getMessage());
		  }
	  // 5. DeselectByValue() void
	  // 6. DeselectByVisibleText() void
	  // 7. DeselectAll() void
	   //8. isMultiple() Boolean
	  // 9. getAllSelectedOptions() List<WebElement>
	  // 10. getFirstSelectedOption() WebElement
	   //11. getOptions() List<WebElement>
	  List<WebElement> alldropdowns=s.getOptions();
	   
	  for(WebElement oneDropDown:alldropdowns) 
	  {
		  System.out.println("WebElemnt Country name: "+oneDropDown.getText());
	  }
	  
	  System.out.println();
	  
	 System.out.println( alldropdowns.size()); //10 is count
	  for(int i=0; i<=alldropdowns.size()-1; i++) 
	  {
		 System.out.println(alldropdowns.get(i).getText());
	  }
	  
	   
	}

}
