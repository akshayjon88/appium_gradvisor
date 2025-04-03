package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.baseTest2;
import pages.Registration;

public class RegistrationTest extends baseTest2 {
	
	//WebDriver driver;
	@Test
	
	public void testvalidation() {
		Registration regPage= new Registration(driver);
//		regPage.enterStudentName("akshay");
//		  System.out.println("✅ Attempted to enter student name.");
//		Assert.assertTrue(regPage.isNameFieldVisible(), "name field is not visible");
  try {
	        regPage.enterStudentName("akshay");
	        System.out.println("✅ Attempted to enter student name."); // Ensure this prints
	    } catch (Exception e) {
	        System.out.println("❌ Exception in `enterStudentName()`: " + e.getMessage());
	    }
	    Assert.assertTrue(regPage.isNameFieldVisible(), "❌ Name field is not visible");
	}
	}


