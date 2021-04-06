package selenimGridcocepty;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;





public class GirdConcept {
	@Test
	public void loginVerify() throws MalformedURLException
	
	{
		//WebDriverManager.firefoxdriver().setup();
		DesiredCapabilities cap=DesiredCapabilities.firefox();
		cap.setPlatform(Platform.WIN10);
		
		URL url=new URL("http://localhost:4444/wd/hub");
		WebDriver driver=new RemoteWebDriver(url,cap);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("anush505@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("@sai1234$");
		driver.findElement(By.name("login")).click();
		System.out.println(driver.getTitle());
		
	}

}
