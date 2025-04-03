package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class baseTest2 {
	 protected WebDriver driver;  // Protected for access in child classes

	    @BeforeMethod
	    @Parameters("browser")
	    public void setup(String browser) {
	        if (browser.equalsIgnoreCase("chrome")) {
	         //   System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
	            driver = new ChromeDriver();
	        } else if (browser.equalsIgnoreCase("firefox")) {
	           // System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
	            driver = new FirefoxDriver();
	        } else if (browser.equalsIgnoreCase("edge")) {
	          //  System.setProperty("webdriver.edge.driver", "src/test/resources/drivers/msedgedriver.exe");
	            driver = new EdgeDriver();
	        } else {
	            throw new IllegalArgumentException("Invalid browser: " + browser);
	        }

	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	        // Navigate to registration form URL
	        driver.get("https://www.jotform.com/form-templates/exam-registration-form");
           System.out.println(" this is done redirect to correct url");
	    }

	    @AfterMethod
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }

}
