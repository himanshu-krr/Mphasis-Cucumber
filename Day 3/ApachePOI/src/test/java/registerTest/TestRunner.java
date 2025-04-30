package registerTest;

import org.testng.annotations.Test;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/java/registertests/Inputs.feature", glue="registertests", tags="@tag1")
public class TestRunner extends AbstractTestNGCucumberTests {
	
}
