package day44;

import org.testng.annotations.Test;

public class SignUp {

	@Test(priority=1 ,groups= {"regression"})
	void signUpByFacebook() 
	{
		System.out.println("This is signUp by Facebook");
	}
	
	@Test(priority=2 ,groups= {"regression"})
	void signUpByByEmail() 
	{
		System.out.println("This is signUp by Email");
	}
	
	@Test(priority=3 ,groups= {"regression"})
	void signUpByByTwitter() 
	{
		System.out.println("This is signUp by Twitter");
	}
}
