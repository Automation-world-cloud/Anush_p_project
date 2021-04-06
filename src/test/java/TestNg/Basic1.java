package TestNg;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Basic1 {
	@BeforeTest
	public void testStart()
	{
		System.out.println("Test is going to Start");
	}
	@AfterTest
	public void testEnd()
	{
		System.out.println("Test is End");
	}
	@Test(groups="an")
	public void m1()
	{
		  System.out.println("This is method1");
	}
	@Test(invocationCount = 5)
	public void m2()
	{
		System.out.println("This is method 2");
		
	}

}
