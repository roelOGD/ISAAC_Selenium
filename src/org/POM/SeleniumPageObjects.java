package org.POM;

import org.Shared.StaticClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumPageObjects {

	public SeleniumPageObjects(){
		System.out.println("test1 "+StaticClass.driver);
		PageFactory.initElements(StaticClass.driver, this);
	}
	
	// Initialize my objects in the page
	//public SeleniumPageObjects(WebDriver driver){
	//	PageFactory.initElements(driver, this);
	//}
	
	@FindBy(linkText="Download")
	public WebElement lnkDownload;
	
	@FindBy(xpath="//div[@id='header']/h1/a")
	public WebElement lnkHome;
	
	public void ClickDownload(){
		System.out.println("test2 "+StaticClass.driver);
		lnkDownload.click();		
	}
	
	public void NavigateHome(){
		lnkHome.click();		
	}
}
