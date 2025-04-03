package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Registration {
	WebDriver driver;
  public Registration(WebDriver driver) {
  		 if (driver == null) {
             throw new IllegalStateException("❌ WebDriver is not initialized. Check setup method.");
         }
	this.driver=driver;	
		}	
  	private By studentNameField = By.id("dssdfsdf");
 
  	public void enterStudentName(String Sname) {
  		driver.findElement(studentNameField).sendKeys(Sname);
  	}
    public boolean isNameFieldVisible() {
        return driver.findElement(studentNameField).isDisplayed();
    }
		
	

}
