package openBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisableNot {
		public static void main(String[] args) {
			ChromeOptions opt=new ChromeOptions();
			opt.addArguments("--disable notifications");
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
			WebDriver driver=new ChromeDriver(opt);
			driver.get("https://www.facebook.com/");
			driver.findElement(By.id("email")).sendKeys("anush505@gmail.com");
			driver.findElement(By.id("pass")).sendKeys("@ANush123$");
			driver.findElement(By.id("u_0_d_2h ")).click();
}
}