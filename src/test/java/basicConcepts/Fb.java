package basicConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("anush505@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("@sai1234$");
	driver.findElement(By.name("login")).click();
	System.out.println(driver.getTitle());
}
}
