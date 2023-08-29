package Step;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login
{
	@Given("user is calculated {int}\\/{int}")
	public void user_is_calculated(Integer int1, Integer int2) {
		int i=1/0;
		System.out.println(i);
	}
	
	@Given("user has calculated the value")
	public void user_has_calculated_the_value() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	
	@Given("user is on login page")
	public void user_is_on_login_page() 
	{
		
	}

	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password() 
	{
		
	}

	@And("click on login button")
	public void click_on_login_button() 
	{
		
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() 
	{
		
	}

	@When("user enter invalid username and password")
	public void user_enter_invalid_username_and_password() 
	{
	}

	@Then("error message is displayed with - Invalid credentials")
	public void error_message_is_displayed_with_invalid_credentials() 
	{
		
	}
	
	@When("user enter invalid username and valid password")
	public void user_enter_invalid_username_and_valid_password() 
	{
		
	}
	
	@Then("error message is displayed with - please enter valid username")
	public void error_message_is_displayed_with_please_enter_valid_username() 
	{
		
	}

	@When("user enter valid username and invalid password")
	public void user_enter_valid_username_and_invalid_password() 
	{
		
	}
	
	@Then("error message is displayed with - please enter valid password")
	public void error_message_is_displayed_with_please_enter_valid_password() 
	{
		
	}

}
