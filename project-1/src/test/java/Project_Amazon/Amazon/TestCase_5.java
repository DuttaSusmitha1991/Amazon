package Project_Amazon.Amazon;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import Utility.DataUtility;

//Test searching for products using its name like shoe.
public class TestCase_5 extends Launch_quite{
	@Test
	public void Searching_Product() throws EncryptedDocumentException, IOException, InterruptedException {
		HomeScreen hs = new HomeScreen(driver);
	    hs.HoverOver();
	    DataUtility da = new DataUtility();
	    da.fetch_data();
	    Registration reg = new Registration(driver);
	    reg.UName();
	    reg.ContinueButton();
	    reg.PWord();
	    reg.signin();
	    HomePage hp = new HomePage(driver);
	    hp.search();
	    
	    
	    
	    
		
		
		
		
	}
	

}
