package day2;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features = "src/test/java/day2/testdata.feature",
	    glue = "day2",
	    tags = "@tag1",
	    plugin = {"pretty"}
	)

public class TestRunner extends AbstractTestNGCucumberTests{

}
