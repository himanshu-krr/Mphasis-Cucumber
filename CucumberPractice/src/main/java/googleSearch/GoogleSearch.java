package googleSearch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
	
	WebDriver wd;
	WebElement we; 
	
	public void initWeb(WebDriver wd)
	{
		this.wd = wd;
	}
	
	public void launchWeb()
	{
		wd.get("https://www.google.com/");
	}
	
	public void enterText()
	{
		we = wd.findElement(By.xpath("//textarea[@class='gLFyf']"));
		we.sendKeys("Java");
	}
	
	public void pressEnter()
	{
		we.sendKeys(Keys.ENTER);
	}
	
	public void checkIfNavigated()
	{
		wd.getPageSource().contains("Download Java for Desktops");
	}
	

}
