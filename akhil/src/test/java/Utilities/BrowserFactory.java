package Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
 
	
	public static  WebDriver StartingApplication(WebDriver driver,String browser,String url) {
		
		if(browser.equalsIgnoreCase("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\uday_2\\eclipse-workspace\\akhil\\Drivers\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			
		}else if (browser.equalsIgnoreCase("ie")) {
			
			
		}
		else {
			System.out.println("Browser is not supported ");
		}
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		
		
		
		return driver;
	}
	
	public static WebDriver quitBrowser(WebDriver driver) {
		driver.quit();
		return driver;
		
		
	}
	
	
	
	
	
	
	
}
