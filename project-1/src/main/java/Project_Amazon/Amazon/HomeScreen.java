package Project_Amazon.Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeScreen
{
	WebDriver driver;

	@FindBy(linkText = "Start here.")
	WebElement startHere_btn;

	@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")
	WebElement Hover_SignIn;
	
	public void HoverOver() {
		Hover_SignIn.click();
	}


	public HomeScreen(WebDriver driver){
		PageFactory.initElements(driver, this);

	}

}
