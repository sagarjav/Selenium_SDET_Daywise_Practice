package day42;

import org.testng.annotations.Test;

/*
 * 1.open app
 * 2.login app
 * 3.logout
 */
public class FirstTestCase
{

	@Test(priority=1)
	void openapp() 
	{
		System.out.println("--open app--");
	}
	
	@Test(priority=2)
	void loginapp() 
	{
		System.out.println("--Login app--");
	}
	
	@Test(priority=3)
	void logout() 
	{
		System.out.println("--Logout app--");
	}
	
	
}
