package day43;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsDemo 
{

	@Test
	void testtitle() 
	{
		String exp_title="Opencart";
		String act_title="Opencart";
		
		/*if(exp_title.equals(act_title)) 
		{
			System.out.println("Test is passed");
		}
		else
		{
			System.out.println("Test is failed");
		}*/
		
		Assert.assertEquals(exp_title, act_title);
		//Assert.assertTrue(true);
	
		//Assert.fail();
	}
	
	
}
