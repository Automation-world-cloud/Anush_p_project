package Dummy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ex4 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu");
		WebElement ele = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/p[1]/select[1]"));
		Select se=new Select(ele);
		List<WebElement> elee = se.getOptions();
		List actual=new ArrayList();
		List temp=new ArrayList();
		for(WebElement e:elee)
		{
			actual.add(e.getText());
			temp.add(e.getText());
		}
		Collections.sort(temp,Collections.reverseOrder());
		System.out.println(temp);
		if(temp.equals(actual))
		{
			System.out.println("fail");
		}
		else
		{
			System.out.println("pass");
		}

}
}