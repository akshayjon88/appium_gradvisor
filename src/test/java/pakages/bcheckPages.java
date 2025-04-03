package pakages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class bcheckPages {
	WebDriver driver;
	public bcheckPages(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//div[@class=\"yfootlinks petit nb\"]/a[1]")
	private WebElement link;

	public void clickonButton() {
		link.click();
	}
}
