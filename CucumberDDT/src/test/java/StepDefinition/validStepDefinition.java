package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import orangeHRM.dashboardPage;
import orangeHRM.loginPage;

public class validStepDefinition {
	
	WebDriver wd = new ChromeDriver();
	loginPage lp = new loginPage(wd);
	dashboardPage dp = new dashboardPage(wd);
	
	
	@Given("I am on login page")
    public void iAmOnLoginPage() {
		wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @When("I enter username")
    public void iEnterUsername() {
    	lp.enterUsername();
    }

    @And("I enter password")
    public void iEnterPassword() {
    	lp.enterPassword();
    }

    @When("I click login button")
    public void iClickLoginButton() {
    	lp.clickLogin();
    }
    
    @Then("I am on dashboard page")
    public void iAmOnDashBoardPage()
    {
    	dp.verifyDashboard();
    }
    

}
