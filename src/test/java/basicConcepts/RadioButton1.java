package basicConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RadioButton1 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		List<WebElement> elements = driver.findElements(By.xpath("//input[@type='radio'and @name='lang']"));
		/*for(int i=0;i<elements.size();i++) 
		{
			WebElement we = elements.get(i);
			String attribute = we.getAttribute("value");
			System.out.println(attribute);
			if(attribute.equalsIgnoreCase("ruby"))
			{
				we.click();
			}
		}*/
		for(WebElement ele:elements)
		{
			String attribute = ele.getAttribute("value");
			if(attribute.equalsIgnoreCase("ruby"))
			{
				ele.click();
				}
		}
	}

}
