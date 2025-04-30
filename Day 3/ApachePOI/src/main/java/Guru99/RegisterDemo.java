package Guru99;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterDemo {
	
	WebDriver wd = new ChromeDriver();
	ReadData r;
	
	public RegisterDemo() throws IOException {
		r = new ReadData();
	}
	
	public void init() {
		wd.get("https://www.demo.guru99.com/test/newtours/register.php");
		wd.manage().window().maximize();
	}
	
	public void enter_firstname() {
		wd.findElement(By.xpath("//input[@name='firstName']")).sendKeys(r.ReadFirstName());
	}
	
	public void enter_pincode() {
		Long l = r.ReadPinCode();
		String s = l.toString();
		wd.findElement(By.xpath("//input[@name='postalCode']")).sendKeys(s);
	}
	
	public void select_Country() throws InterruptedException {
		WebElement we = wd.findElement(By.xpath("//select[@name='country']"));
		Thread.sleep(5000);
//		we.click();
		Select s = new Select(we);
		Thread.sleep(5000);
		s.selectByVisibleText(r.ReadCountry());
	}
	
	public void enter_username() throws InterruptedException {
		Thread.sleep(5000);
		wd.findElement(By.xpath("//input[@id='email']")).sendKeys(r.ReadUserName());
	}
	
	public void enter_password() {
		wd.findElement(By.xpath("//input[@name='password']")).sendKeys(r.ReadPassword());
		wd.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(r.ReadPassword());
	}
	
	public void submit() {
		wd.findElement(By.xpath("//input[@name='submit']")).click();
	}

}
