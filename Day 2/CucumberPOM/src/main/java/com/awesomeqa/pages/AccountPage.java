package com.awesomeqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage {
    WebDriver driver;

    public AccountPage(WebDriver driver) {
        this.driver = driver;
    }

    private By accountHeader = By.xpath("//h2[contains(text(),'My Account')]");

    public String getAccountText() {
        return driver.findElement(accountHeader).getText();
    }
}
