package listen;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import base.ProjectsSpecificMethod;
import utils.ExtentReportDemo;

public class Listener extends ProjectsSpecificMethod implements ITestListener {
	
	//call getreport() method of ExtentReportDemo class
	ExtentReports extent=ExtentReportDemo.getreport(); 
	ExtentTest test;

	@Override
	public void onTestStart(ITestResult result) {
		test=extent.createTest(result.getMethod().getMethodName())
				.assignAuthor("Lavish jain")
				.assignDevice("chrome")
				.assignCategory("smoke","regression");
		//logging->Test start of test 
		test.log(Status.INFO, "Test Started :"+result.getMethod().getMethodName());
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test Passed.");
	}
	@Override
	public void onTestFailure(ITestResult result) {
		//capturing of the screenshot part
//		test.fail(result.getThrowable());
		String filepath=null;

		try {
			//call method takescreenshot created utility
			filepath =takeScreenshot(result.getMethod().getMethodName());
			System.out.println(filepath);
		} catch (IOException e) {
			e.printStackTrace();
		}

		test.addScreenCaptureFromPath(filepath, result.getMethod().getMethodName());
	}
	
//	@Override
//	public void onTestSkipped(ITestResult result) {
//		//report of skipped test case
//		test.log(Status.SKIP, "Test Skipped: "+result.getMethod().getMethodName());
//	}
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		test.log(Status.FAIL, "Test Failed but with sucess percetange "+result.getMethod().getMethodName());
	}
	

//	@Override
//	public void onStart(ITestContext context) {
//		test.log(Status.INFO, "Start Test suite "+context.getAllTestMethods());
//		
//	}
	
	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
	}
	
	
	



}
