package Rajineesh;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreen {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();//upcasting
		driver.get("http://demo.guru99.com/V1/index.php");
		driver.findElement(By.name("uid")).sendKeys("mngr321497");
		driver.findElement(By.name("password")).sendKeys("ehYrapY");
		driver.findElement(By.name("btnLogin")).click();
		WebElement ele = driver.findElement(By.name("password"));
		String title = driver.getTitle();
		if(title.equals("GTPL Banking Manager HomePage"))
		{
			System.out.println("Login success");
		}
		else
		{
			TakesScreenshot ts=(TakesScreenshot)driver;//typecasting
			File src = ts.getScreenshotAs(OutputType.FILE);
			File tar=new File("./screenshot/rajineeshele.png");
			FileUtils.copyFile(src, tar);
		}
		
	}

}
