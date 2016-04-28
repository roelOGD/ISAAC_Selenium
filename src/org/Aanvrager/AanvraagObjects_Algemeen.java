package org.Aanvrager;

import org.Shared.StaticClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AanvraagObjects_Algemeen {

	public AanvraagObjects_Algemeen(){
		PageFactory.initElements(StaticClass.driver, this);
	}
	
	@FindBy(id="aq-main-form")	public WebElement Field_MainForm;	
	@FindBy(id="Aanvraag-Titel_1")	public WebElement Field_AanvraagTitle_1;	
	@FindBy(id="Aanvraag-Samenvatting_1") public WebElement Field_AanvraagSamenvatting_1;	
	@FindBy(id="Aanvraag-StartdatumGepland_1") public WebElement Field_AanvraagStartdatumGepland_1;
	@FindBy(id="Aanvraag-EinddatumGepland_1") public WebElement Field_AanvraagEinddatumGepland_1;
	@FindBy(id="Uploaden_1_1") public WebElement Field_Uploaden_1_1;
	@FindBy(id="Verder_2") public WebElement Field_Verder_2;
	
	// De individuele velden
	public void setText_AanvraagTitle_1(String text){
		Field_AanvraagTitle_1.sendKeys(text);
		Assert.assertEquals(Field_AanvraagTitle_1.getAttribute("value"), text);
	}
	
	public void setText_AanvraagSamenvatting_1(String text){
		Field_AanvraagSamenvatting_1.sendKeys(text);
		Assert.assertEquals(Field_AanvraagSamenvatting_1.getAttribute("value"), text);
	}
	
	public void setText_AanvraagStartdatumGepland_1(String text) throws InterruptedException{
		Field_AanvraagStartdatumGepland_1.sendKeys(text);
		Field_MainForm.click();
		Assert.assertEquals(Field_AanvraagStartdatumGepland_1.getAttribute("value"), text);
		// Het veld refreshed na het invullen
		Thread.sleep(2000);
	}
	
	public void setText_AanvraagEinddatumGepland_1(String text) throws InterruptedException{
		Field_AanvraagEinddatumGepland_1.sendKeys(text);
		Field_MainForm.click();
		// Het veld refreshed na het invullen
		Assert.assertEquals(Field_AanvraagEinddatumGepland_1.getAttribute("value"), text);
		Thread.sleep(2000);
	}
	
	public void uploadDocument_Field_Uploaden_1_1(String path){
		Field_Uploaden_1_1.sendKeys(path);
		// wacht totdat het document is geupload
		WebDriverWait wait = new WebDriverWait(StaticClass.driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Aanvraag-Document-container-1_1")));
	}
	
	public AanvraagObjects_VraagBegroting clickNext(){
		Field_Verder_2.click();
		WebDriverWait wait = new WebDriverWait(StaticClass.driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Aanvraag-Conform_Tarievenlijst_1")));
		return new AanvraagObjects_VraagBegroting();
	}
	
}
