package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="./Features/orangeHRM.feature", 
		glue="StepDefinition",
		tags= "@valid or @invalid",
		monochrome = true
		)

public class TestRunner extends AbstractTestNGCucumberTests{

}