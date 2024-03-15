package Project_Amazon.Amazon;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import Utility.DataUtility;

//Ensure login fails with incorrect email or password
public class TestCase_3 extends Launch_quite{
	@Test
	public void incorrect() throws EncryptedDocumentException, IOException, InterruptedException {
		DataUtility d = new DataUtility();
		d.fetch_data();
		
		  HomeScreen hs = new HomeScreen(driver); 
		  hs.HoverOver();
		  Registration reg = new Registration(driver);
		  //reg.In_Name();
		  reg.ContinueButton();
		  reg.PWord();
		  reg.signin();
		  
	}

}
