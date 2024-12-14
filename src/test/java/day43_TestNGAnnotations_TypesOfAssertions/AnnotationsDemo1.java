package day43_TestNGAnnotations_TypesOfAssertions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsDemo1 
{

	@BeforeMethod
	void login() 
	{
		System.out.println("This is login");
	}
	
	@Test(priority=1)
	void search() 
	{
		System.out.println("This is search");
	}
	
	@Test(priority=2)
	void Adsearch() 
	{
		System.out.println("This is Adsearch");
	}
	
	@AfterMethod
	void logput() 
	{
		System.out.println("This is logout");
	}
	
	
	
	
}
