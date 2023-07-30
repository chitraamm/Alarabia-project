package listeners;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import resourcee.Base;
import utilities.ExtentReporter;

public class Listeners extends Base implements ITestListener{
	
	public WebDriver driver = null;
	ExtentReports extentReport = ExtentReporter.getExtentReport();
	ExtentTest extentTest;
	
	//Parallel execution//
//	ThreadLocal<ExtentTest> extentTestThread = new ThreadLocal<ExtentTest>();

	@Override
	public void onTestStart(ITestResult result) {
		
		String testName = result.getName();
	
		extentTest = extentReport.createTest(testName);
		
		//Parallel execution//
//		extentTestThread.set(extentTest);
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		
		String testName = result.getName();
		
		extentTest.log(Status.PASS, testName+"got passed");
		
		//Parallel execution//
//		extentTestThread.get().log(Status.PASS, testName+"got passed");
	
		
	}

	@Override
	public void onTestFailure(ITestResult result) {

		
		
		String testName = result.getName();
		
		
		extentTest.fail(result.getThrowable());
		
		//Parallel execution//
//		extentTestThread.get().fail(result.getThrowable());
		
		
		
		try {
			driver = (WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
			
			e.printStackTrace();
		}
		
		try {
			String screenshotFilePath = takeScreenshot(testName, driver);
			extentTest.addScreenCaptureFromPath(screenshotFilePath, testName);
			
			//Parallel execution//
//			extentTestThread.get().addScreenCaptureFromPath(ScreenshotFilePath, testName);
			
		}catch (IOException e) {
			e.printStackTrace();
		
		}
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {

	}

	@Override
	public void onStart(ITestContext context) {

	}

	@Override
	public void onFinish(ITestContext context) {

		
		extentReport.flush();
		
		
	}

//	@Override
//	public int hashCode() {
//	
//		return super.hashCode();
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//	
//		return super.equals(obj);
//	}
//
//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//	
//		return super.clone();
//	}
//
//	@Override
//	public String toString() {
//	
//		return super.toString();
//	}
//
//	@SuppressWarnings("deprecation")
//	@Override
//	protected void finalize() throws Throwable {
//	
//		super.finalize();
//	}
	

}
