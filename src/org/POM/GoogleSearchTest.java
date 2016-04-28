package org.POM;

import org.Shared.StaticClass;
import org.openqa.selenium.WebDriver;

public class GoogleSearchTest extends StaticClass{
	
	@Override
	public WebDriver getDriver() {
		return super.getDriver();
	}
	
	public static void main (String[] args) throws InterruptedException{
		
		// Ga naar google.com
		driver.navigate().to("http://google.com");

		// Object for the page
		// GoogleHomePageObjects page = new GoogleHomePageObjects(driver);
		GoogleHomePageObjects page = new GoogleHomePageObjects();
		page.SearchGoogle("Selenium");
		
		Thread.sleep(5000);
		// Click op de link Selenium web Automation
		SeleniumPageObjects selPage = page.ClickSelenium();
		
		// Wait for page to load
		Thread.sleep(5000);
		
		// Click op de download knop
		selPage.ClickDownload();
		
		//selPage.NavigateHome();
				
	} 
}
