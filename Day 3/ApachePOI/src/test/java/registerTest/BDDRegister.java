package registerTest;

import java.io.IOException;

import io.cucumber.java.en.*;
import Guru99.RegisterDemo;

public class BDDRegister {
	
	RegisterDemo r ;
	
	public BDDRegister() throws IOException {
		r = new RegisterDemo();
	}
	
	@Given("I am in the register page of DemoGurus99 Application")
	public void register_launch() {
		r.init();
	}
	
	@When("I enter the firstname")
	public void firstname() {
		r.enter_firstname();
	}
	
	@When("I enter the postalcode")
	public void postalcode() {
		r.enter_pincode();
	}
	
	@When("I select the country based on my data")
	public void country() throws InterruptedException {
		r.select_Country();
	}
	
	@When("I enter the username")
	public void username() throws InterruptedException {
		r.enter_username();
	}
	
	@When("I enter the password and confirm it")
	public void password() {
		r.enter_password();
	}
	
	@And("I click on submit")
	public void submit() {
		r.submit();
	}
	
	@Then("I have registered into this application")
	public void registered() {
		System.out.println("Registered");
	}

}
