package stepdefine;

import Factory.baseone;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;

public class hooks extends baseone {
	
	
//    @BeforeAll
//    public static void beforeAllTests() {
//        System.out.println("🚀 Starting test execution...");
//    }
	@Before
	public void setup() {
		browser();
		
	}
	@AfterAll
	public static void tearDown() {
		driver.quit();
	}

}
