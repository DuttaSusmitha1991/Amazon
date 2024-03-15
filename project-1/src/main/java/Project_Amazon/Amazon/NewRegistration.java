package Project_Amazon.Amazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewRegistration {
	@FindBy(linkText ="Start here.")
	WebElement start_button;
	
	@FindBy(id="ap_customer_name")
	WebElement First_Name;
	
	@FindBy(id="ap_phone_number")
	WebElement Mobile_Num;
	
	@FindBy(id ="ap_password")
	WebElement password;
	
	@FindBy(id ="auth-continue")
	WebElement verifyMobileNum;
	
	

}
