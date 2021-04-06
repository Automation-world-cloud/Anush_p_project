package TestNg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Para {
	@Parameters({"browser","userid","pwd"})
	@Test
	public void login(String page,String uid,String password)
	{
		System.out.println("page url is"+page);
		System.out.println("user name is"+uid);
		System.out.println("password is"+password);
	}

}
