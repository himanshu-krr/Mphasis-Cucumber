package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutomationExercise {
	
	WebDriver wd;
	
	public AutomationExercise(WebDriver wd)
	{
		this.wd = wd;
	}
	
	public void launchWeb()
	{
		wd.get("https://automationexercise.com/login");
	}
	
	public void enterName(String name)
	{
		wd.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys(name);
	}
	
	public void enterEmail(String email)
	{
		wd.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys(email);
	}
	
	public String clickSignup(String s1)
	{
		wd.findElement(By.xpath("(//button[@class='btn btn-default'])[2]")).click();
		String s = (s1.equals("Fail"))?(wd.findElement(By.xpath("//p[@style='color: red;']")).getText()):wd.findElement(By.xpath("//b[contains(text(),'Enter Account Information')]")).getText();
		return s;
	}

}
