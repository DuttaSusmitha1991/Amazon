package Project_Amazon.Amazon;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import Utility.DataUtility;

//Check if a user can successfully edit their profile information
@Test
public class TestCase_4 extends Launch_quite{
	
	public void edit_profile() throws EncryptedDocumentException, IOException, InterruptedException {
		HomeScreen hs = new HomeScreen(driver);
	    hs.HoverOver();
	    
	    DataUtility da = new DataUtility();
	    da.fetch_data();
	    Registration reg = new Registration(driver);
	    reg.UName();
	    reg.ContinueButton();
	    reg.PWord();
	    reg.signin();
	    HomeScreen h = new HomeScreen(driver);
	    h.HoverOver();
	    ProfileChanges p1 = new ProfileChanges(driver);
	    p1.login_Sec();
		/*
		 * Registration re = new Registration(driver); re.PWord(); re.signin();
		 */
	    ProfileChanges p = new ProfileChanges(driver);
	    p.namechanges();
	    
	}
	

}
