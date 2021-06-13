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
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreeenShotmini {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver  driver=new ChromeDriver();
		driver.get("https://www.nopcommerce.com/en/demo");
		WebElement ele = driver.findElement(By.className("desktop-store-image"));
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ele.getScreenshotAs(OutputType.FILE);
		File tar=new File("./screenshot/ele.png");
		FileUtils.copyFile(src, tar);
		
	}

}
