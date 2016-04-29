package org.Aanvrager;

import org.Aanvrager.Relatiebeheer.RelatiebeheerObjects_ZoekenOrganisatie;
import org.Shared.StaticClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AanvraagObjects_Organisaties {

	public AanvraagObjects_Organisaties(){
		PageFactory.initElements(StaticClass.driver, this);
	}
	
	@FindBy(id="button-rb-link_1")	public WebElement toevoegenVerwantwoordelijkeOrganisatie;	
	@FindBy(id="button-rb-link_2")	public WebElement toevoegenUitvoerendeOrganisatie;	
	@FindBy(id="Verder_2")	public WebElement Field_Verder_2;	
	
	public RelatiebeheerObjects_ZoekenOrganisatie toevoegenVerwantwoordelijkeOrganisatie(){
		toevoegenVerwantwoordelijkeOrganisatie.click();
		WebDriverWait wait = new WebDriverWait(StaticClass.driver, 15);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("organisatienaam")));
		return new RelatiebeheerObjects_ZoekenOrganisatie();
	}
	
	public AanvraagObjects_NonReferenten clickNext(){
		Field_Verder_2.click();
		WebDriverWait wait = new WebDriverWait(StaticClass.driver, 15);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Aanvraag-GeenNonReferenten_1")));
		return new AanvraagObjects_NonReferenten();
	}
	
}
