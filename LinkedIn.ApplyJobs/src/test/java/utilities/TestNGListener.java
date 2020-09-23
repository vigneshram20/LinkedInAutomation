package utilities;

import java.io.IOException;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;


public class TestNGListener implements ITestListener,ISuiteListener {

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestStart");
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestSuccess");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("onTestFailure");
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("onTestSkipped");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("onTestFailedButWithinSuccessPercentage");
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("onStart with Context");
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("onFinish with Context");
	}

	public void onStart(ISuite suite) {
		// TODO Auto-generated method stub
		System.out.println("On Start Suite ");
	}

	public void onFinish(ISuite suite) {
		// TODO Auto-generated method stub
		System.out.println("On Finish Suite");
	}
	
	@DataProvider
	public void data()
	{
		System.out.println("Data Provider");
	}
	
	
}
