package org.Admin;

import org.Shared.StaticClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminObjects_AanvragenSpecifiekeAanvraagHomePage {
	public AdminObjects_AanvragenSpecifiekeAanvraagHomePage(){
		PageFactory.initElements(StaticClass.driver, this);
	}	
	
	@FindBy(xpath="//input[@id='Aanvragen_1']") WebElement Field_Aanvragen;
	@FindBy(xpath="//input[@id='Referentencyclus_1']") WebElement Field_ReferentenCyclus;
	@FindBy(xpath="//input[@id='AOleden_1']") WebElement Field_Commissie;
	
}
