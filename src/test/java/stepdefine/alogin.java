package stepdefine;

import Factory.baseone;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class alogin extends baseone {

	@Given("user redirect to login page")
	public void user_redirect_to_login_page() {
	   if(driver==null) {
		   throw new IllegalStateException("driver is not initialzed");
	   }
	   driver.get("https://www.google.com/");
	}

	@When("user enter emailID")
	public void user_enter_email_id() {
	   
	}

	@And("user enter has password")
	public void user_enter_has_password() {
	  
	}

	@Then("user click on login button")
	public void user_click_on_login_button() {
	   
	}

}
