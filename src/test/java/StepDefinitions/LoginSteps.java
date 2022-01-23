package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("^user is on login page$")
	public void user_is_on_login_page() {
		System.out.println("Inside Step -User is on Login page");
	}

	@When("^user enter username and password$")
	public void user_enter_username_and_password() {
		System.out.println("Inside Step -User enter Username And Password");
	}

	@And("^clicks on login button$")
	public void clicks_on_login_button() {
		System.out.println("Inside Step -User Clicks on Btn Login");
	}

	@Then("^user is navigated to the home page$")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("Inside Step -User is navigated_to_the_home_page");
	}

}
