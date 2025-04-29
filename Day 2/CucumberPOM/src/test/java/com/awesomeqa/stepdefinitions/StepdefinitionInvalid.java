package com.awesomeqa.stepdefinitions;

import static org.testng.Assert.assertEquals;

import com.awesomeqa.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.cucumber.java.en.*;

public class StepdefinitionInvalid {
	
    WebDriver driver = new EdgeDriver();
    LoginPage loginPage = new LoginPage(driver);

    @Given("I am in loginn page of AwesomeQA application")
    public void i_am_in_login_page_invalid() {
    	
    	loginPage.launchWeb();
        System.out.println("I am in login page of awesomeqa application");
    }

    @When("I enter invalid username")
    public void i_enter_invalid_username() {
        loginPage.enterUsername("himanshu123456789");
        System.out.println("I enter invalid username");
    }

    @When("I enter invalid password")
    public void i_enter_invalid_password() {
        loginPage.enterPassword("pswd12345632");
        System.out.println("I enter invalid password");
    }

    @And("I click on loginn button")
    public void i_click_invalid_login() {
        loginPage.clickLogin();
        System.out.println("I click on loginn button");
    }

    @Then("Error message is displayed")
    public void error_message_displayed() {
        String expectedText = "Warning: No match for E-Mail Address and/or Password.";
        String actualText = loginPage.getErrorMessage();
        assertEquals(expectedText, actualText);
        System.out.println("Error message is displayed");
    }
}
