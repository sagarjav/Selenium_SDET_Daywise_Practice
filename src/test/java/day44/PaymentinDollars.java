package day44;

import org.testng.annotations.Test;

public class PaymentinDollars {

	@Test(priority=1, groups= {"sanity","regression","functional"})
	void paymentinRupees() 
	{
		System.out.println("This is payment in rupees");
	}
	
	@Test(priority=2, groups= {"sanity","regression","functional"})
	void paymentinDollar() 
	{
		System.out.println("This is payment in dollar");
	}
	
	
}
