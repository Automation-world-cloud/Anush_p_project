package TestNg;

import org.testng.annotations.Test;

public class Basic2 {
	@Test
	public void m3()
	
	{
		System.out.println("This is method 3");
	}
@Test(groups = "an")
public void m4()
{
	System.out.println("This is method 4");
}
}
