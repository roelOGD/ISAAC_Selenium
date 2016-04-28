package org.POM;

import org.Shared.StaticClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePageObjects {
	
	public GoogleHomePageObjects(){
		System.out.println("test1 "+StaticClass.driver);
		PageFactory.initElements(StaticClass.driver, this);
	}
	
	
	// Initialize my objects in the page
	//public GoogleHomePageObjects(WebDriver driver){
	//	PageFactory.initElements(driver, this);
	//}
	
	@FindBy(name="q")
	public WebElement txtSearch;
	
	@FindBy(name="btnG")
	public WebElement btnSearch;
	
	@FindBy(linkText="Selenium - Web Browser Automation")
	public WebElement lnkSelenium;
	
	public void SearchGoogle(String searchText){
		System.out.println("test1 "+StaticClass.driver);
		// Search for the text Selenium
		txtSearch.clear();
		txtSearch.sendKeys(searchText);
		// Click the search button
		btnSearch.click();
	}
	
	public SeleniumPageObjects ClickSelenium(){
		System.out.println("test1 "+StaticClass.driver);
		lnkSelenium.click();
		return new SeleniumPageObjects();
	}
}
