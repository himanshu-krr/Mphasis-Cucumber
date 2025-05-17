package orangeHRM;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	
	WebDriver wd;
	
	By un = By.xpath("//input[@placeholder='Username']");
	By pw = By.xpath("//input[@placeholder='Password']");
	By login = By.xpath("//button[@type='submit']");
	By actu = By.xpath("//*[text()='Invalid credentials']");
	
	public loginPage(WebDriver wd)
	{
		this.wd = wd;
	}
	
	public void enterUsername()
	{
		wd.findElement(un).sendKeys();
	}
	
	public void enterPassword()
	{
		wd.findElement(pw).sendKeys();
	}
	
	public void clickLogin()
	{
		wd.findElement(login).click();
	}
	
	public void verifyLogin()
	{
		String act = wd.findElement(actu).getText();
		String exp = "Invalid credentials";
		Assert.assertEquals(act, exp);
	}

}
