package org.Aanvrager;

import java.util.List;

import org.Shared.StaticClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AanvraagObjects_Bevestiging {
	
	public AanvraagObjects_Bevestiging(){
		PageFactory.initElements(StaticClass.driver, this);
	}
	
	@FindBy(xpath="//label[@class='for-checkbox uncheck']") List<WebElement> chkbx_AanvraagOndertekend;
	@FindBy(id="Indienen_1")	public WebElement Field_Indienen;	
	
	// De individuele velden
	public void clickChkbxAanvraagOndertekendn() throws InterruptedException{
		chkbx_AanvraagOndertekend.get(0).click();
	}
	
	public void clickNext(){
		Field_Indienen.click();
	}
}
