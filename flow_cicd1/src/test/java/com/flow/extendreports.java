package com.flow;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
//reports.endTest();
//test.log(LogStatus.PASS,"Test Passed");
//test.log(LogStatus.FAIL,"Test Failed");
//test.log(LogStatus.SKIP,"Test Skipped");
//test.log(LogStatus.INFO,"Test Info");




public class extendreports {
	static ExtentTest test;
	static ExtentReports report;
	@Test 
	void report() {
		String name="testing";
		System.out.println("this month is April");
		if (name.equalsIgnoreCase("testing")) {
			test.log(LogStatus.PASS,"Test Passed");
			
		}else {
			test.log(LogStatus.FAIL, "test fail -name not match");
		}
		
	}
	@BeforeClass
void before() {
		report = new ExtentReports(System.getProperty("user.dir")+"ExtentReportResults.html");
		test = report.startTest("ExtentDemo");
	
}
	void after() {
		report.endTest(test);
		report.flush();
	}
}
