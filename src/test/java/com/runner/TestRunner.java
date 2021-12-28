package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Features",
		glue="com.Step_def",
		dryRun=false,
		monochrome=true,
		plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "json:target/cucumber-report.json"}		)
/*
 * ,"html:target/cucumber-reports/cucumber.html",
 * "json:target/cucumber-reports/cucumber.json",
 */
public class TestRunner {

}
