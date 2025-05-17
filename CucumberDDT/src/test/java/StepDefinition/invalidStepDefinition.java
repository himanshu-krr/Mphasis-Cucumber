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

public class invalidStepDefinition {
    
    WebDriver wd = new ChromeDriver();
    loginPage lp = new loginPage(wd);
    ReadData rd = new ReadData();
    List<String[]> testData;

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() throws IOException {
        wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        testData = rd.getNames();
    }

    @When("I enter invalid username")
    public void iEnterInvalidUsername() {
        lp.enterUsername(testData.get(1)[0]); // Invalid data (Second row)
    }

    @And("I enter invalid password")
    public void iEnterInvalidPassword() {
        lp.enterPassword(testData.get(1)[1]); // Invalid password
    }

    @When("I click the login button")
    public void iClickTheLoginButton() {
        lp.clickLogin();
    }
    
    @Then("I verify the login error")
    public void iVerifyLoginError() {
        lp.verifyLogin();
    }
}
