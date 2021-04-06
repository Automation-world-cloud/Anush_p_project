package dataDriven;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Basic {
	WebDriver driver;
	@Test(dataProvider = "logincred")
	public void verifyLogin(String uid,String pwd)
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/V1/index.php");
		driver.findElement(By.name("uid")).sendKeys(uid);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.name("btnLogin")).click();
		String title = driver.getTitle();
		if(driver.getTitle().equals("GTPL Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			
		}
		else
		{
			
			Assert.assertTrue(false);
			
		}
		
		}
		@AfterMethod
		public void tearDown()
		{
			driver.quit();
		}
	
	
	
		
	
@DataProvider(name="logincred")
public Object logData() throws Exception
{
String path="C:\\Users\\anush\\Desktop\\logdata.xlsx";
ReadData r=new ReadData();
int rowcount = r.getRowNum(path, "sheet1");
int colcount = r.getColNum(path, "sheet1", 0);
	Object[][] obj=new Object[rowcount][colcount];
	
	for(int i=1;i<=rowcount;i++)
	{
		for(int j=0;j<colcount;j++)
		{
			obj[i-1][j]=r.getData(path, "sheet1", i, j);
		}
	}
	return obj;
}
}
