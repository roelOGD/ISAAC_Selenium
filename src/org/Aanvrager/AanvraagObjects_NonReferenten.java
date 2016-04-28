package org.Aanvrager;

import java.util.List;

import org.Shared.StaticClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AanvraagObjects_NonReferenten {

	public AanvraagObjects_NonReferenten(){
		System.out.println("test1 "+StaticClass.driver);
		PageFactory.initElements(StaticClass.driver, this);
	}
	@FindBy(xpath="//label[@class='for-checkbox uncheck']") List<WebElement> chkbx_NonReferenten;
	@FindBy(id="Verder_2")	public WebElement Field_Verder_2;	
	
	
	// Met deze method wordt automatisch alle velden van het tabblad ingevuld
	public AanvraagObjects_Bevestiging setText_TabbladNonReferenten() throws InterruptedException{
		clickChkbxNonReferenten();
		return clickNext();
	}
		
	// De individuele velden
	public void clickChkbxNonReferenten() throws InterruptedException{
		chkbx_NonReferenten.get(0).click();
	}
	
	public AanvraagObjects_Bevestiging clickNext(){
		Field_Verder_2.click();
		WebDriverWait wait = new WebDriverWait(StaticClass.driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Aanvraag-Ondertekend_1")));
		return new AanvraagObjects_Bevestiging();
	}
	
}
