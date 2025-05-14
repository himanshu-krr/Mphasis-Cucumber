package stepdefinitions;


import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features="./Features/LoginFeature.feature", 
		glue="stepdefinitions", 
		tags="@tag1",
		monochrome = true,
		plugin = {"pretty", "html:target/HTMLReportTest/newtestreport1.html"} 
		)
public class Runner extends AbstractTestNGCucumberTests{

}
