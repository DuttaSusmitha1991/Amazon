package Project_Amazon.Amazon;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Utility.DataUtility;

public class TestCase_2 extends Launch_quite {

	
	@Test
	public void Correct_credentials() throws EncryptedDocumentException, IOException, InterruptedException {
		//
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		DataUtility d = new DataUtility();
		d.fetch_data();
		
		  HomeScreen hs = new HomeScreen(driver); 
		  hs.HoverOver();
		 
		//hs.toLoginPage();
		Registration reg = new Registration(driver);
		reg.UName();
		reg.ContinueButton();
		reg.PWord();
		reg.signin();
		
		
	}
}
