package day2;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDefinition {
	
	@Given("I am in login page")
    public void iAmInLoginPage() {
        System.out.println("Navigating to login page...");
    }

    @When("^I check for the (.*)$")
    public void iCheckForTheNameInStep(String name) {
        System.out.println("Checking for name: " + name);
    }

    @And("I check the1 (.*)$")
    public void iCheckTheValueInStep(int value) {
        System.out.println("Checking for value: " + value);
    }

}
