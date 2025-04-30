package automationTest;

import org.openqa.selenium.WebDriver;
import static org.testng.Assert.assertEquals;
import org.openqa.selenium.edge.EdgeDriver;

import automation.AutomationExercise;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdefinition {
		
		
		WebDriver wd = new EdgeDriver(); 
		AutomationExercise ae = new AutomationExercise(wd);

		@Given("I am on Register Page")
		public void I_am_on_Register_Page()
		{
			ae.launchWeb();
			System.out.println("I am on Register Page");
		}
	
	    @When("^I enter the (.*$)")
	    public void I_enter_the_name(String name)
	    {
	    	ae.enterName(name);
	    	System.out.println("Entering the name: "+name);
	    }
	    
	    
	    @And("^I give the (.*$)")
	    public void I_give_the_email(String email)
	    {
	    	ae.enterEmail(email);
	    	System.out.println("Entering the email: "+email);
	    }
	    
	    @Then("^I verify the (.*$)")
	    public void I_enter_the_status(String status)
	    {
	    	String verify = ae.clickSignup(status);
	    	assertEquals((status.equals("Fail")?"Email Address already exist!":"ENTER ACCOUNT INFORMATION"),verify);
	    	System.out.println("Checking the status: "+status);
	    }
}
