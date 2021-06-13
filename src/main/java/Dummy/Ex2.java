package Dummy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ex2 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu");
		List<WebElement> ele = driver.findElements(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/p[1]/select[1]"));
Set<WebElement> s=new HashSet<WebElement>();

	/*for(WebElement e:ele)
{
	String text = e.getText();
	//System.out.println(text);
	List temp=new ArrayList();
	List actual=new ArrayList();
	temp.add(text);
	actual.add(text);
	//System.out.println(actual);
	
	
}*/
		/*for(int i=0;i<ele.size();i++)
		{
			for(int j=i+1;j<ele.size();j++)
			{
				if(ele.get(i).equals(ele.get(j)))
				{
					System.out.println(ele.get(i).getText());
				}
				else
				{
					System.out.println("no duplicates");
				}
			}
		}*/
		for( WebElement e:ele)
		{
			if(s.add(e)==false)
			{
				System.out.println(e);
			}
			else
			{
				System.out.println("no duplicates");
			}
		}
		
		}

}
