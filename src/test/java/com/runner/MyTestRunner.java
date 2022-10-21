package com.runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"html:target/cucumber-html-report", "json:target/cucumber.json",
		"pretty", }, features = { "src/test/resources/features" }, glue = { "com.steps" }, monochrome = true)

public class MyTestRunner {
// "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html",
	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(
				new File("C:\\Users\\ahamed.sabid\\Documents\\Practice projects\\cucumber\\extent-config.xml"));
		Reporter.setSystemInfo("User Name", "AJ");
		Reporter.setSystemInfo("Application Name", "Test App ");
		Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name").toString());
		Reporter.setSystemInfo("Environment", "Production");
		Reporter.setTestRunnerOutput("Test Execution Cucumber Report");
	}

}
