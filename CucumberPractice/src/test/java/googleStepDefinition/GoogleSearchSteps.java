package googleStepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import googleSearch.GoogleSearch;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	
	
	WebDriver wd = new ChromeDriver();
	GoogleSearch gs = new GoogleSearch();
	
	@Given("Browser is open")
	public void browser_is_open() {
		gs.initWeb(wd);
		System.out.println("Browser is open");
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		gs.launchWeb();
		System.out.println("User is on google search page");
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() {
		gs.enterText();
		System.out.println("User enters a text in search box");
	}

	@And("hits enter")
	public void hits_enter() {
		gs.pressEnter();
		System.out.println("User hits enter");
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		gs.checkIfNavigated();
		System.out.println("User is navigated to search results");
	}


}
