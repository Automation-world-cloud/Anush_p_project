package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DtaProvider {
	WebDriver driver;
@Test(dataProvider = "data")
public void login(String uname,String pwd)
{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys(uname);
	driver.findElement(By.id("pass")).sendKeys(pwd);
	driver.findElement(By.name("login")).click();
	String title = driver.getTitle();
	Assert.assertEquals(title, "Facebook – log in or sign up");
	System.out.println("Home page opened");
}
@DataProvider(name ="data")
public Object[][] dp()
{
	Object[][] obj=new Object[3][2];
	obj[0][0]="anush505@gmail.com";
	obj[0][1]="@sai12";
    obj[1][0]="anush";
    obj[1][1]="@sai123445";
	obj[2][0]="anush505@gmail.com";
	obj[2][1]="@sai1234$";
	return obj;
}
}
