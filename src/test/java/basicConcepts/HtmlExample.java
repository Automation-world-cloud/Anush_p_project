package basicConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlExample {
	public static void main(String[] args) {
		WebDriver driver=new HtmlUnitDriver();
		
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("anush505@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("@ANush123$");
		driver.findElement(By.name("login")).click();
		System.out.println(driver.getTitle());
	}

}
