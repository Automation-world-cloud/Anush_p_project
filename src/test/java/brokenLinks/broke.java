package brokenLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class broke {
	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/V1/index.php");
		driver.findElement(By.name("uid")).sendKeys("mngr315514");
		driver.findElement(By.name("password")).sendKeys("ypygynu");
		driver.findElement(By.name("btnLogin")).click();
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		Set<String> ActLinks=new HashSet<String>();
		for(WebElement e:links)
		{
			String link = e.getAttribute("href");
			if(link !=null && !(link.isEmpty()))
			{
				ActLinks.add(link);
			}
		}
		System.out.println(ActLinks .size());
		for( String url:ActLinks)
		{
		HttpURLConnection con=(HttpURLConnection) new URL(url).openConnection();
		con.connect();
		int cod = con.getResponseCode();
		String msg = con.getResponseMessage();
		System.out.println(ActLinks +"-------->"+cod+"------->"+msg);
		}
		
		driver.close();
	}

}
