package org.Admin;

import org.Shared.StaticClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class AdminObjects_AanvragenSpecifiekeRondeHomepage {
	public AdminObjects_AanvragenSpecifiekeRondeHomepage(){
		PageFactory.initElements(StaticClass.driver, this);
	}	
	
	@FindBy(xpath="//input[@id='Aanvragen_1']") WebElement Field_Aanvragen;
	@FindBy(xpath="//input[@id='Referentencyclus_1']") WebElement Field_ReferentenCyclus;
	@FindBy(xpath="//input[@id='AOleden_1']") WebElement Field_Commissie;
	
	
	public void gaNaarAanvragen() throws InterruptedException{
		Thread.sleep(200);
		Field_Aanvragen.click();
		WebDriverWait wait = new WebDriverWait(StaticClass.driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("AantalIngediendeAanvragen_1")));			
	}
	
	public void gaNaarReferentenCyclus(){
		Field_ReferentenCyclus.click();
		WebDriverWait wait = new WebDriverWait(StaticClass.driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Referenten_Uitnodigen_1")));			
	}
	
	public void gaNaarCommissie(){
		Field_Commissie.click();
		WebDriverWait wait = new WebDriverWait(StaticClass.driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Uitnodigen_Belangenverstrengeling_1")));			
	}
}
