package stepdefine;

import Factory.baseone;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pakages.bcheckPages;

public class bcheck extends baseone{

	@Given("user visist on yopmail")
	public void user_visist_on_yopmail() {
		 if(driver==null) {
			   throw new IllegalStateException("driver is not initialzed");
		   }
		
		 driver.get("https://yopmail.com/en/");
	}
	@When("user click on product")
	public void user_click_on_product() {
		bcheckPages page= new bcheckPages(driver);
		page.clickonButton();
	
	}

}
