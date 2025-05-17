package orangeHRM;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class loginPage {
    
    WebDriver wd;
    WebDriverWait wait;

    By un = By.xpath("//input[@placeholder='Username']");
    By pw = By.xpath("//input[@placeholder='Password']");
    By login = By.xpath("//button[@type='submit']");
    By actu = By.xpath("//*[text()='Invalid credentials']");
    
    public loginPage(WebDriver wd) {
        this.wd = wd;
        this.wait = new WebDriverWait(wd, Duration.ofSeconds(10)); // Explicit wait initialization
    }
    
    public void enterUsername(String username) {
        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(un));
        usernameField.sendKeys(username);
    }
    
    public void enterPassword(String password) {
        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(pw));
        passwordField.sendKeys(password);
    }
    
    public void clickLogin() {
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(login));
        loginButton.click();
    }
    
    public void verifyLogin() {
        WebElement errorMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(actu));
        String act = errorMsg.getText();
        String exp = "Invalid credentials";
        Assert.assertEquals(act, exp);
    }
}
