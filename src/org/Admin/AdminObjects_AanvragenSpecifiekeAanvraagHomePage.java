package org.Admin;

import java.util.List;

import org.Shared.StaticClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminObjects_AanvragenSpecifiekeAanvraagHomePage {
	public AdminObjects_AanvragenSpecifiekeAanvraagHomePage(){
		PageFactory.initElements(StaticClass.driver, this);
	}	
	
	@FindBy(xpath="//input[@id='filter-Werklijst_SR_Aanvragen_BMW_2']") WebElement Field_Filter;
	
	public void zoekEnKlikOpAanvraag(String text) throws InterruptedException{
		Field_Filter.sendKeys(text);
		Thread.sleep(3000);		
		clickResultaat();		
	}
		
	public void clickResultaat(){
		List<WebElement> resultaten = StaticClass.driver.findElements(By.xpath("//td[@class='table-column']"));
		WebElement resultaat = resultaten.get(0);
		resultaat.click();	
		WebDriverWait wait = new WebDriverWait(StaticClass.driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Ontvankelijkheid_4")));	
	}
}
