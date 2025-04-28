package day1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScriptBddDay1 {

	@Given("I am in home page of awesomeqa applicaton")

		public void I_am_in_home_page_of_awesomeqa_applicaton()
		{
			System.out.println("I am in home page of awesomeqa applicaton");
		}
	
    @When("I click on my account")
    	
    	public void I_click_on_my_account()
    	{
    		System.out.println("I click on my account");
    	}
    
    
    @And("I click on login")
    
    	public void I_click_on_login()
    	{
    		System.out.println("I click on login");
    	}
    
    @When("I enter the username")  
    	public void I_enter_the_username()
    	{
    		System.out.println("I enter the username");
    	}

    @When("I enter the password")  
    	public void I_enter_the_password()
    	{
    		System.out.println("I enter the password");
    	}

    @And("I click on login button")  
    	public void I_click_on_login_button()
    	{
        	System.out.println("I click on login button");
    	}

    @Then("I am in my account details page")  
    	public void I_am_in_my_account_details_page()
    	{
    		System.out.println("I am in my account details page");
    	}

}
