package loginDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import loginDemo.LoginDemo;

public class LoginDefinition {
	
	WebDriver wd = new ChromeDriver();
	LoginDemo ld = new LoginDemo();
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
		ld.initWeb(wd);
		ld.launchWeb();
	}

	@When("User enters username and password")
	public void user_enters_username_and_password() {
		ld.enterUsernameAndPassword();
	}

	@And("Clicks on login button")
	public void clicks_on_login_button() {
		ld.clickLogin();
	}

	@Then("User is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		ld.verify();
	}

}
