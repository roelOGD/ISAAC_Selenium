package org.Admin;
import org.Shared.BaseMethodsClass;
import org.Shared.StaticClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminObjects_AanvragenSpecifiekeAanvraagOverzicht {
	public AdminObjects_AanvragenSpecifiekeAanvraagOverzicht(){
		PageFactory.initElements(StaticClass.driver, this);
	}	
	
	public void gaNaarOntvankelijkheidTab() throws InterruptedException{
		BaseMethodsClass.clickEnWachtOpElementByXPATH("input", "id", "Ontvankelijkheid_4", "Wacht.By.id", null, null, "Validatie_2");	
	}
}
