package orangeHRM;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class dashboardPage {
	
	WebDriver wd;
	
	By actu = By.xpath("(//*[text()='Dashboard'])[1]");
	
	public dashboardPage(WebDriver wd)
	{
		this.wd = wd;
	}
	
	public void verifyDashboard()
	{
		String act = wd.findElement(actu).getText();
		String exp = "Dashboard";
		
		Assert.assertEquals(act, exp);
	}

}
