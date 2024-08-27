package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

//method to get report
public class ExtentReportDemo {
	
	//functionality to get the report details
	public static ExtentReports getreport() {
		//provide path  to capture .html report
		String path="D:\\JavaConcept\\pageobjectmodeljat21\\Reports\\index.html";
		//create a physical reporter
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		//provide title of the report
		reporter.config().setReportName("Ecommerce-Automation Framework");
		reporter.config().setDocumentTitle("Demoblaze-Webiste");
		reporter.config().setTheme(Theme.DARK);
		
		
		//Add automation to physical report
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(reporter);
		return extent;
		
	}

}
