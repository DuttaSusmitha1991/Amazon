package Project_Amazon.Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.DataUtility;

public class Registration extends DataUtility {
	//WebDriver driver;
	@FindBy(id ="ap_email")
	WebElement Username_1;
	
	@FindBy(className = "a-button-input")
	WebElement Continue_Button;
	
	@FindBy(id="ap_password")
	WebElement password;
	
	@FindBy(id ="signInSubmit")
	WebElement SignIn_Button;	
	
	public void UName() {
		Username_1.sendKeys(UserName);
		
	}

	/*
	 * public void In_Name() { Username_1.sendKeys(IncorrectUN);
	 * 
	 * }
	 */
	public void ContinueButton() {
		Continue_Button.click();
	}
	public void PWord() {
		password.sendKeys(Password);
	}
	public void signin() {
		SignIn_Button.click();
		
	}
	public Registration(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
