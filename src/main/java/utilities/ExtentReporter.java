package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import resourcee.Base;

public class ExtentReporter extends Base {
	
	
	static ExtentReports extentReport;
	
	public  static ExtentReports getExtentReport() {
		
		String extentReportPath = System.getProperty("user.dir")+"//reports//extentreport.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(extentReportPath);
		reporter.config().setReportName("Alarabia Automation Results");
		reporter.config().setDocumentTitle("Test Results");
		
		extentReport = new ExtentReports();
		extentReport.attachReporter(reporter);
		extentReport.setSystemInfo("Operating System", "Windows");
		extentReport.setSystemInfo("Tested By", "Chitra");
		
		
		
		return extentReport;
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		utilities
	}

}
