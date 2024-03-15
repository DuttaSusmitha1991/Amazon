package Project_Amazon.Amazon;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	@FindBy(id ="twotabsearchtextbox")
	WebElement search_tf;
	
	/*
	 * @FindBy(id ="nav-search-submit-button") WebElement search_Icon;
	 */
	public void search() {
		search_tf.sendKeys("shoe");
		search_tf.sendKeys(Keys.ENTER);
		
	}
	/*
	 * public void search_icon() { search_Icon.click(); }
	 */
	

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
