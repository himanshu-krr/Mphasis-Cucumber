package com.awesomeqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    
    public void launchWeb()
    {
    	driver.get("https://www.awesomeqa.com/ui/index.php?route=account/login");
    }

    private By usernameField = By.xpath("//input[@class='form-control']");
    private By passwordField = By.name("password");
    private By loginButton = By.xpath("//input[@value='Login']");
    private By errorMessage = By.xpath("//div[@class='alert alert-danger alert-dismissible']");

    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }
}
