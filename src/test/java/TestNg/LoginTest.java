package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
	@Test
	public void fbLogin()
	{
		System.out.println("Face book login TEst");
		Assert.assertEquals("Anush","Anush");
	}
	@Test
	public void bankLogin()
	{
		System.out.println("Bank page login Test");
		Assert.assertEquals("Anush", "Reddy");
	}

}
