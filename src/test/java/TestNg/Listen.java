package TestNg;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listen extends TestListenerAdapter {
	public void onTestStart(ITestResult tr) {
		System.out.println("Test start");
	}

	public void onTestSuccess(ITestResult tr) {
		System.out.println("Test passed");
	}

	public void onTestFailure(ITestResult tr) {
		System.out.println("Test Failed");
	}

	public void onTestSkipped(ITestResult tr) {
		System.out.println("Test Skipped");
	}

}
