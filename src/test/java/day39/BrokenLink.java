package day39;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links: "+ links.size());
		
		int totalbrokenlinks=0;
		int Nobrokenlinks=0;
		
		for(WebElement link:links)
		{
			String hrefattribute=link.getAttribute("href");
			
			if(hrefattribute==null || hrefattribute.isEmpty()) 
			{
				System.out.println("not possible to check");
				continue;
			}
			
			//hit url to server
			
			URL linkurl=new URL(hrefattribute);
			HttpURLConnection conn=(HttpURLConnection) linkurl.openConnection();
			conn.connect(); //coonect to server and sent request the server
			conn.getResponseCode();
			
			try
			{
					if(conn.getResponseCode()>=400) 
					{
						System.out.println(hrefattribute+"  ===> Broken links: ");
						totalbrokenlinks++;
					}
					else 
					{
						System.out.println(hrefattribute+"  ====> Not Broken links: ");
						Nobrokenlinks++;
					}
			
			}
			
			catch(Exception e)
			{
				
			}
			
			
		}
		
		System.out.println("total broken links is: "+ totalbrokenlinks);
		System.out.println("total NO broken links is: "+ Nobrokenlinks);
		System.out.println("Total number of links: "+ links.size());
		

		driver.quit();
	}

}
