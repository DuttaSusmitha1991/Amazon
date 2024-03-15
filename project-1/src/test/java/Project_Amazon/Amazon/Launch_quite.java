package Project_Amazon.Amazon;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Launch_quite {
	
	WebDriver driver;
	@BeforeMethod
	public void login() {
	 driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in");
        driver.manage().window().maximize();
		//driver.navigate().refresh();
		
		
		
	}
	@AfterMethod 
	public void close() {
		//driver.close();
		
		
	}

}
