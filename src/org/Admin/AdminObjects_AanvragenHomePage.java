package org.Admin;

import java.util.List;

import org.Shared.StaticClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminObjects_AanvragenHomePage {
	public AdminObjects_AanvragenHomePage(){
		PageFactory.initElements(StaticClass.driver, this);
	}	
	
	@FindBy(xpath="//input[@id='filter-Werklijst_Subsidierondes_BMW_2']") WebElement zoekFilter;
	
	public void zoekOpRonde(String text) throws InterruptedException{
		zoekFilter.sendKeys(text);
		Thread.sleep(3000);	
		clickGevondenRonde(text);
	}

	public void clickGevondenRonde(String text) throws InterruptedException{
		List<WebElement> we = StaticClass.driver.findElements(By.xpath("//div[@class='aq-answer-holder ']"));
		we.get(0).click();
		WebDriverWait wait = new WebDriverWait(StaticClass.driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Aanvragen_1")));	
	}	
}
