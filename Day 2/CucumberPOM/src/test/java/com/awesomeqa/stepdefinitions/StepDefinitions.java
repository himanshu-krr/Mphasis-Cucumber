package com.awesomeqa.stepdefinitions;

import com.awesomeqa.pages.LoginPage;
import com.awesomeqa.pages.AccountPage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.cucumber.java.en.*;

public class StepDefinitions {
	
    WebDriver driver = new EdgeDriver();
    LoginPage loginPage = new LoginPage(driver);
    AccountPage accountPage = new AccountPage(driver);

    @Given("I am in login page of AwesomeQA application")
    public void i_am_in_login_page() {
    	
        loginPage.launchWeb();
        System.out.println("I am in login page of awesomeqa application");
    }

    @When("I enter the username")
    public void i_enter_username() {
        loginPage.enterUsername("johndoe12345@gmail.com");
        System.out.println("I enter the username");
    }

    @When("I enter the password")
    public void i_enter_password() {
        loginPage.enterPassword("johndoe123");
        System.out.println("I enter the password");
    }

    @And("I click on login button")
    public void i_click_login() {
        loginPage.clickLogin();
        System.out.println("I click on login button");
    }

    @Then("I am in my account details page")
    public void i_am_on_account_page() {
        String expectedText = "My Account";
        String actualText = accountPage.getAccountText();
        assertEquals(expectedText, actualText);
        System.out.println("I am in my account details page");
    }
}
