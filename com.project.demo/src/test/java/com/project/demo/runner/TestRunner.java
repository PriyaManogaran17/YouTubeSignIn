package com.project.demo.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = "com.project.demo.stepDefinition",
		dryRun = false,
		monochrome = true,
		plugin = "html:report/Htmlreport")
public class TestRunner {

}
