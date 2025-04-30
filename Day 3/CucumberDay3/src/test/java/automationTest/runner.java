package automationTest;

import org.testng.annotations.Test;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features = "src/test/java/automationTest/automation.feature", // Ensure correct feature file path
	    glue = "automationTest",                                 // Correct package name
	    tags = "@tag1"
	)

public class runner extends AbstractTestNGCucumberTests{

}