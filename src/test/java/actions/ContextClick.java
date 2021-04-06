package actions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContextClick {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	Actions a=new Actions(driver);
	WebElement element = driver.findElement(By.xpath("//span[text()='right click me']"));
	a.contextClick(element).build().perform();
	driver.findElement(By.xpath("//span[text()='Copy']")).click();
	driver.switchTo().alert().accept();
	
}
}
