package Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseone {
	protected static WebDriver driver;  
	public void browser() {
		if(driver==null) {
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			
		}
		 
		
		
	}
}
