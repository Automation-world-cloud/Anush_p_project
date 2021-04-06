package javasript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSE {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");		
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement userid = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
		WebElement button = driver.findElement(By.id("u_0_d_PF"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='anush5095'", userid);
		js.executeScript("arguments[1].value='@sai1234$'", password);
		js.executeScript("arguments[0].click()", button);
		
	}

}
