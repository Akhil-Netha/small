package TestCases;

import org.testng.annotations.Test;

import PageObject.HomePage;

public class TC_001 extends BaseClass{
	
	
	
	@Test
	public void Amazon() throws InterruptedException {
		HomePage  home = new HomePage(driver);
		
		home.Search("bikes");
		
		Thread.sleep(3000);
		
		System.out.println("In Amazon search bar we searched bikes");
	}
}
