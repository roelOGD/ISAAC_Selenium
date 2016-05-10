package org.Admin;

import org.Shared.BaseMethodsClass;
import org.Shared.StaticClass;
import org.openqa.selenium.support.PageFactory;


public class AdminObjects_AanvragenSpecifiekeAanvraagOntvankelijkheidValidatie {
	public AdminObjects_AanvragenSpecifiekeAanvraagOntvankelijkheidValidatie(){
		PageFactory.initElements(StaticClass.driver, this);
	}	
	
	public void chckbx_Aanvrager_gevalideerd_JA() throws InterruptedException{
		BaseMethodsClass.clickOpElementByXPATH("label", "for", "Aanvraag-Check_Aanvrager_11");	
	}
	
	public void chckbx_Aanvrager_gevalideerd_NEE() throws InterruptedException{
		BaseMethodsClass.clickOpElementByXPATH("label", "for", "Aanvraag-Check_Aanvrager_12");	
	}
	
	public void chckbx_Aanvrager_gevalideerd_NVT() throws InterruptedException{
		BaseMethodsClass.clickOpElementByXPATH("label", "for", "Aanvraag-Check_Aanvrager_13");	
	}
	
	public void chckbx_Aanvraag_Check_Inhoudelijk_JA() throws InterruptedException{
		BaseMethodsClass.clickOpElementByXPATH("label", "for", "Aanvraag-Check_Inhoudelijk_11");	
	}
	
	public void chckbx_Aanvraag_Check_Inhoudelijk_NEE() throws InterruptedException{
		BaseMethodsClass.clickOpElementByXPATH("label", "for", "Aanvraag-Check_Inhoudelijk_12");	
	}
	
	public void chckbx_Aanvraag_Check_Inhoudelijk_NVT() throws InterruptedException{
		BaseMethodsClass.clickOpElementByXPATH("label", "for", "Aanvraag-Check_Inhoudelijk_13");	
	}
	
	public void chckbx_Aanvraag_Check_Financieel_JA() throws InterruptedException{
		BaseMethodsClass.clickOpElementByXPATH("label", "for", "Aanvraag-Check_Financieel_11");	
	}
	
	public void chckbx_Aanvraag_Check_Financieel_NEE() throws InterruptedException{
		BaseMethodsClass.clickOpElementByXPATH("label", "for", "Aanvraag-Check_Financieel_12");	
	}
	
	public void chckbx_Aanvraag_Check_Financieel_NVT() throws InterruptedException{
		BaseMethodsClass.clickOpElementByXPATH("label", "for", "Aanvraag-Check_Financieel_13");	
	}
	
	public void btnVastleggenClick() throws InterruptedException{
		BaseMethodsClass.clickEnWachtOpElementByXPATH("input", "id", "Vastleggen_1", "Wacht.By.XPATH", "input", "id", "Validatie_2");	
	}
	
	public void btnKoppelWerkzaamheidClick() throws InterruptedException{
		BaseMethodsClass.clickEnWachtOpElementByXPATH( "input", "title", "Wijzig werkzaamheid", "Wacht.By.XPATH", "input", "value", "Toevoegen werkzaamheid");	
	}
	
}
