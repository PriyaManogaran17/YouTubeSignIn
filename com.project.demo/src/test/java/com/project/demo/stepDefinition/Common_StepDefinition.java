package com.project.demo.stepDefinition;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.project.demo.utilities.CommonUtils;
import com.project.demo.webDriverManager.DriverManager;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Common_StepDefinition {
	
	CommonUtils commonUtils = new CommonUtils();
	public static ExtentReports extentReport;
	public static ExtentSparkReporter spark;
	
	@Before
	public void beforeScenario(){
		commonUtils.loadProperties();
		DriverManager.launchBrowser();
		commonUtils.initElements();
	}
	
	public static void extentReport(String name, String description) {
		if(extentReport==null) {
		extentReport = new ExtentReports();
		spark = new ExtentSparkReporter("ExtentReport.html");
		extentReport.attachReporter(spark);
		}
		extentReport.createTest(name).log(Status.PASS, description);
	}
	
	public static void failReport(String name, String description) {
			extentReport.createTest(name).log(Status.FAIL, description);
	}
	
	@After
	public void afterScenario(){
		extentReport.flush();
		DriverManager.getDriver().quit();
	}
	
}
