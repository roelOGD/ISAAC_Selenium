package org.Admin;

import org.Shared.BaseMethodsClass;
import org.Shared.StaticClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class test {
	public test(){
		PageFactory.initElements(StaticClass.driver, this);
	}	
	
	public void kliklogin() throws InterruptedException{
		BaseMethodsClass.clickEnWachtOpElementByXPATH("input", "value", "Aanmelden", "Wacht.By.id", null, null, "_58_login");
				
	}
}
