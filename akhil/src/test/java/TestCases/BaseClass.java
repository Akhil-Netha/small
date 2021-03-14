package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import Utilities.BrowserFactory;

public class BaseClass {

	public static WebDriver driver;
	
	
	
	@BeforeClass
	public void startBrowser() {
		driver = BrowserFactory.StartingApplication(driver, "chrome", "https://www.amazon.in/");
	}
	@AfterClass
	public void QiutBrowser() {
		driver= BrowserFactory.quitBrowser(driver);
	}
	
	
	
	
}
