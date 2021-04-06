package Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAlert {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("anush");
	driver.switchTo().frame("frame3");
	driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	driver.switchTo().defaultContent();
	driver.switchTo().frame(1);
	//driver.findElement(By.xpath(""))
	
	
}
}
