package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import orangeHRM.dashboardPage;
import orangeHRM.loginPage;

public class invalidStepDefinition {
	
	WebDriver wd = new ChromeDriver();
	loginPage lp = new loginPage(wd);
	dashboardPage dp = new dashboardPage(wd);
	

	@Given("I am on the login page")
    public void iAmOnTheLoginPage() {
		wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @When("I enter invalid username")
    public void iEnterInvalidUsername() {
    	lp.enterUsername();
    }

    @And("I enter invalid password")
    public void iEnterInvalidPassword() {
    	lp.enterPassword();
    }

    @When("I click the login button")
    public void iClickTheLoginButton() {
    	lp.clickLogin();
    }
    
    @Then("I verify the lgoin error")
    public void iVerifyLoginError()
    {
    	lp.verifyLogin();
    }
	
}
