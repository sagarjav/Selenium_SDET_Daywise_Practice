package day43_TestNGAnnotations_TypesOfAssertions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnnotationsDemo2 
{

	@BeforeClass
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
	
	@AfterClass
	void logput() 
	{
		System.out.println("This is logout");
	}
}
