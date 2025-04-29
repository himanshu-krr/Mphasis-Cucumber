package awesomeqaTest;

import org.testng.annotations.Test;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features = "src/test/java/awesomeqaTest/awesomeqa.feature", // Ensure correct feature file path
	    glue = "awesomeqaTest",                                 // Correct package name
	    tags = "@tag1 or @tag2"
	)

public class runner extends AbstractTestNGCucumberTests{

}
