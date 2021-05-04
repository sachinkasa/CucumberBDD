package StepsDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSteps {

	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("Inside steps - user on login page");
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
		System.out.println("Inside steps - user enter username and password");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("Inside steps - clicks on login button");
	}

	@Then("user is navigate to the home page")
	public void user_is_navigate_to_the_home_page() {
		System.out.println("Inside steps - user landing on home page");
	}


}
