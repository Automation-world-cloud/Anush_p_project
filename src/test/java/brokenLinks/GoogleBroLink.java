package brokenLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleBroLink {
	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		links.add(driver.findElement(By.tagName("img")));
		System.out.println(links.size());
		Set<String> s=new HashSet<String>();
		for(WebElement ele:links)
		{
			String link = ele.getAttribute("href");
			if(link!=null && !(link.isEmpty()))
			{
				s.add(link);
			}
		}
		for( String url:s)
		{
			HttpURLConnection con=(HttpURLConnection) new URL(url).openConnection();
			con.connect();
			int code = con.getResponseCode();
			String msg = con.getResponseMessage();
			System.out.println(s +"----->"+code+"----->"+msg);
		}
		
	}

}
