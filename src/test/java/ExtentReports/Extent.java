package ExtentReports;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class Extent {
	WebDriver driver;
	ExtentHtmlReporter ehr;
	 ExtentReports er;
	 ExtentTest et;
	@BeforeTest
	public void testInfo()
	{
		 ehr=new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/anushreportoftest.html");
		 ehr.config().setReportName("My class reports ext");
		 ehr.config().setDocumentTitle("Demo Title");
		 ehr.config().setTheme(Theme.DARK);
		 er=new ExtentReports();
		 er.attachReporter(ehr);
		 er.setSystemInfo("author ", "Anush Kumar Reddy Gosula");
		 er.setSystemInfo("Environment ", "QA");
		 er.setSystemInfo("Host Name ", "Anush Kumar Reddy Gosula");
		 
	}
	@AfterTest
	public void end()
	{
		er.flush();
	}
@BeforeMethod
public void browserDetails()
{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	driver=new ChromeDriver();
}
@Test
public void login()
{
	et=er.createTest("login");
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("anush505@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("@sai1234$");
	driver.findElement(By.name("login")).click();
	String title = driver.getTitle();
	Assert.assertEquals(title, "log in or sign up");
	
	
}
@AfterMethod
public void endReport(ITestResult re) throws Exception
{
	if(re.getStatus()==ITestResult.SUCCESS)
	{
		et.log(Status.PASS, "Test is passed :"+re.getName());
		et.log(Status.PASS, MarkupHelper.createLabel(re.getName(), ExtentColor.GREEN));
	}
	else if(re.getStatus()==ITestResult.FAILURE)
	{
		et.log(Status.FAIL, "Test is Failed :"+re.getName());
		et.log(Status.FAIL, MarkupHelper.createLabel(re.getName(), ExtentColor.RED));
		String imagePath=Extent.getScreenShot(driver, re.getName());
		et.addScreenCaptureFromPath(imagePath);
	}
	else if(re.getStatus()==ITestResult.SKIP)
	{
		et.log(Status.SKIP, "Test is Skipped :"+re.getName());
		et.log(Status.SKIP, MarkupHelper.createLabel(re.getName(), ExtentColor.BLUE));
	}
}
public static String getScreenShot(WebDriver driver,String screenshotname) throws Exception
{
	 String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
	 TakesScreenshot ts=(TakesScreenshot)driver;
	 File source = ts.getScreenshotAs(OutputType.FILE);
	 String destination=System.getProperty("user.dir")+"/screenshot/"+screenshotname+dateName+".png";
	 File finaldestination=new File(destination);
	 FileUtils.copyFile(source, finaldestination);
	 return destination;
}
}
