package openBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Example {
	public static void main(String[] args) {
		ChromeOptions opt=new ChromeOptions();
		opt.setExperimentalOption("debuggerAddress","localhost:9988");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver(opt);
		//driver.get("https://www.facebook.com/");
		//driver.findElement(By.id("u_0_2_JU")).click();
		driver.findElement(By.name("firstname")).sendKeys(String.valueOf(99589226));
		
		
	}
	}
