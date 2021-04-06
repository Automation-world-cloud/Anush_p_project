package basicConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDroDown {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html#");
	driver.findElement(By.id("menu1")).click();
	List<WebElement> ddele = driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));
	for(WebElement ele:ddele)
	{
		String text = ele.getText();
		System.out.println(text);
		if(text.equalsIgnoreCase("html"))
		{
			ele.click();
		}
	}
}

}
