package selfPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Listoftable {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.kapruka.com/online/samedaydelivery");
		
		Thread.sleep(3);
	
		List<WebElement> lists=driver.findElements(By.xpath("//*[@class='Rebrand_table space-bot']//table//tbody/tr"));
     
	    System.out.println(lists.size());
			
	     for(WebElement list:lists)
			{
				System.out.println(list.getText());
			}
	
	}

}
