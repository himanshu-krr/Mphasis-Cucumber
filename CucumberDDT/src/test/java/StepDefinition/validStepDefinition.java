package StepDefinition;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import orangeHRM.ReadData;
import orangeHRM.loginPage;
import orangeHRM.dashboardPage;

public class validStepDefinition {
    
    WebDriver wd = new ChromeDriver();
    loginPage lp = new loginPage(wd);
    dashboardPage dp = new dashboardPage(wd);
    ReadData rd = new ReadData();
    List<String[]> testData;

    @Given("I am on login page")
    public void iAmOnLoginPage() throws IOException {
        wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        testData = rd.getUsernameAndPassword();
    }

    @When("I enter username")
    public void iEnterUsername() {
        lp.enterUsername(testData.get(0)[0]); // Valid data (First row)
    }

    @And("I enter password")
    public void iEnterPassword() {
        lp.enterPassword(testData.get(0)[1]); // Valid password
    }

    @When("I click login button")
    public void iClickLoginButton() {
        lp.clickLogin();
    }
    
    @Then("I am on dashboard page")
    public void iAmOnDashBoardPage() {
        dp.verifyDashboard();
    }
}
