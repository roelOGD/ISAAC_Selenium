package org.Aanvrager;

import java.util.List;

import org.Shared.StaticClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AanvraagObjects_Bevestiging {
	
	public AanvraagObjects_Bevestiging(){
		System.out.println("test1 "+StaticClass.driver);
		PageFactory.initElements(StaticClass.driver, this);
	}
	
	@FindBy(xpath="//label[@class='for-checkbox uncheck']") List<WebElement> chkbx_AanvraagOndertekend;
	@FindBy(id="Indienen_1")	public WebElement Field_Indienen;	
	
	
	// Met deze method wordt automatisch alle velden van het tabblad ingevuld
	public void setText_TabbladBevestigen() throws InterruptedException{
		clickChkbxAanvraagOndertekendn();
		clickNext();
	}
		
	// De individuele velden
	public void clickChkbxAanvraagOndertekendn() throws InterruptedException{
		chkbx_AanvraagOndertekend.get(0).click();
	}
	
	public void clickNext(){
		Field_Indienen.click();
	}
}
