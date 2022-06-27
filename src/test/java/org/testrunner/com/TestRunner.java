package org.testrunner.com;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src//test//resources//budgetCalculator" }, 
		glue = {"org.budgetcalculator.com" }, monochrome = false, 
		plugin = { "pretty", "html:target/HtmlReports.html","json:target/JsonReports/JsonReport.json", "junit:target/JunitReports/JunitReport.xml" })
public class TestRunner extends AbstractTestNGCucumberTests {
	
}
