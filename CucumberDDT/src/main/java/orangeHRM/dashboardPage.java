package orangeHRM;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class dashboardPage {
    
    WebDriver wd;
    WebDriverWait wait;

    By actu = By.xpath("(//*[text()='Dashboard'])[1]");

    public dashboardPage(WebDriver wd) {
        this.wd = wd;
        this.wait = new WebDriverWait(wd, Duration.ofSeconds(10)); // Explicit wait initialization
    }

    public void verifyDashboard() {
        WebElement dashboardText = wait.until(ExpectedConditions.visibilityOfElementLocated(actu));
        String act = dashboardText.getText();
        String exp = "Dashboard";
        
        Assert.assertEquals(act, exp);
    }
}
