package org.Admin;

import org.Shared.BaseMethodsClass;
import org.Shared.StaticClass;
import org.openqa.selenium.support.PageFactory;


public class AdminObjects_AanvragenSpecifiekeAanvraagOntvankelijkheid {
	public AdminObjects_AanvragenSpecifiekeAanvraagOntvankelijkheid(){
		PageFactory.initElements(StaticClass.driver, this);
	}	
		
	public void gaNaarValidatieScherm() throws InterruptedException{
		BaseMethodsClass.clickEnWachtOpElementByXPATH("input", "id", "Validatie_2", "Wacht.By.id", null, null, "button-rb-link_1");	
	}
	
	public void verklaarOntvankelijk() throws InterruptedException{
		BaseMethodsClass.clickEnWachtOpElementByXPATH("label", "class", "for-radio uncheck", "Wacht.By.id", null, null, "Aanvraag-OntvankelijkOnderVoorwaarden_1");	
	}
	
	public void vastleggen() throws InterruptedException{
		BaseMethodsClass.clickEnWachtOpElementByXPATH("input", "id", "Vastleggen_2", "Wacht.By.id", null, null, "Aanvraag-OntvankelijkOnderVoorwaarden_1");	
		BaseMethodsClass.wachtOpElementByXPATH("", "input", "class", "yesButton aq-button primary");	
		BaseMethodsClass.clickEnWachtOpElementByXPATH("input", "class", "yesButton aq-button primary",  "Wacht.By.id", null, null,"Ontvankelijkheidsmail_1");	
	}
}
