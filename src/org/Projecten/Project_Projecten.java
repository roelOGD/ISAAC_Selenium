package org.Projecten;

import java.util.List;

import org.Shared.StaticClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Project_Projecten {
	public Project_Projecten(){
		PageFactory.initElements(StaticClass.driver, this);
	}
	
	@FindBy(xpath="//input[@id='filter-Werklijst_Projecten_Aanvrager_2']")	public WebElement Field_Filter;	
	
	public void setText_Field_Filter(String text) throws InterruptedException{
		Field_Filter.sendKeys(text);
		Thread.sleep(3000);
		clickResultaat();		
	}
	
	public void clickResultaat(){
		Actions action = new Actions(StaticClass.driver);
		List<WebElement> we = StaticClass.driver.findElements(By.xpath("//div[@class='aq-answer-holder ']"));
		WebElement eerste = we.get(0);
		eerste.click();
		WebDriverWait wait = new WebDriverWait(StaticClass.driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Aanvraag_Details_1")));	
	}
	
}
