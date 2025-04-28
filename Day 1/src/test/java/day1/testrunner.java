package day1;

import org.testng.annotations.Test;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
    features = "src/test/java/day1/TestFeatureFile.feature", // Ensure correct feature file path
    glue = "day1",                                 // Correct package name
    tags = "@tag1"
)
public class testrunner extends AbstractTestNGCucumberTests {
}
