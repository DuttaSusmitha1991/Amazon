package Project_Amazon.Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfileChanges {
	@FindBy(xpath ="(//div[@class='a-column a-span9 a-span-last'])[2]")
	WebElement Login_Security;
	
	@FindBy(id ="ap_password")
	WebElement ProfileEditPW;
	
	@FindBy(id="NAME_BUTTON")
	WebElement NameEdit;
	
	public void login_Sec() {
		Login_Security.click();
	}
	public void namechanges() {
		NameEdit.click();
	}
	ProfileChanges(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	
	
	

}
