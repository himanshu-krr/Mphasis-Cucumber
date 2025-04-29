package com.awesomeqa.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = {"src/test/java/com/awesomeqa/features/login_valid.feature",
                "src/test/java/com/awesomeqa/features/login_invalid.feature"},
    glue = "com.awesomeqa.stepdefinitions",
    tags = "@validLogin or @invalidLogin"
)
public class TestRunner extends AbstractTestNGCucumberTests { }
