package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Reg {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/test/newtours/register.php");
	driver.findElement(By.name("firstName")).sendKeys("Anush");
	Actions a=new Actions(driver);
	a.sendKeys(Keys.TAB)
	.sendKeys("Reddy")
	.sendKeys(Keys.TAB)
	.sendKeys("anush505@gmail.com")
	.build().perform();
}
}
