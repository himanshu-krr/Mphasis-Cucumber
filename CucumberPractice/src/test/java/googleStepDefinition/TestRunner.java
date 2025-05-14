package googleStepDefinition;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="./Features/GoogleSearch.feature", 
		glue="googleStepDefinition",
		monochrome = true
		)
public class TestRunner extends AbstractTestNGCucumberTests{

}