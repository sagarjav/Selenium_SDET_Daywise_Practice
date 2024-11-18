package day38;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SslHandling {

	public static void main(String[] args) {
		
				ChromeOptions options=new ChromeOptions();
				options.setAcceptInsecureCerts(true);  //accept ssl certificates
				
				
				WebDriver driver=new ChromeDriver(options);
				driver.manage().window().maximize();
				driver.get("https://demo.opencart.com/");
				
				System.out.println("Test is passed");
				

				driver.quit();
	}

}
