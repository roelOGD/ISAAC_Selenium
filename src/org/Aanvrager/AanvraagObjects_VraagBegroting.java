package org.Aanvrager;

import java.util.ArrayList;
import java.util.List;

import org.Shared.StaticClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AanvraagObjects_VraagBegroting {

	public AanvraagObjects_VraagBegroting(){
		PageFactory.initElements(StaticClass.driver, this);
	}
	
	@FindBy(id="aq-main-form")	public WebElement Field_MainForm;	
	@FindBy(xpath="//label[@class='for-checkbox uncheck']") List<WebElement> chckbx_TarievenLijst;
	@FindBy(id="Toevoegen_1")	public WebElement Field_Toevoegen_1;	
	@FindBy(className="for-checkbox uncheck")	public WebElement chckbx_TarievenLijst2;	
	@FindBy(id="Verder_2") public WebElement Field_Verder_2;
	
	
	// De individuele velden
	public void clickTarievenLijst_chckbx() throws InterruptedException{
		Thread.sleep(100);
		chckbx_TarievenLijst.get(0).click();
	}
		
	// De individuele velden
	public void AddVraagBegrotingItem(int veldNummer, String begrotingsGroep, String omschrijving, String FTE, String aantalMaanden, String startSchaal, String totaal) throws InterruptedException{
		Field_Toevoegen_1.click();
		
		String Field_BegrotingsGroep = "BegrotingPost-TarievenlijstItem_" + veldNummer;
		String Field_Omschrijving = "BegrotingPost-Omschrijving_" + veldNummer;
		String Field_FTE = "BegrotingPost-AantalFTE_" + veldNummer;
		String Field_AantalMaanden = "BegrotingPost-TotaalAantalMaanden_Invoer_" + veldNummer;
		String Field_StartSchaal = "BegrotingPost-Startschaal_" + veldNummer;
		String Field_Totaal = "BegrotingPost-Bedrag_Invoer_" + veldNummer;
		
		WebDriverWait wait = new WebDriverWait(StaticClass.driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id(Field_BegrotingsGroep)));
		
		List<WebElement> ListBegrotingsGroep = StaticClass.driver.findElements(By.xpath("//*[@id='BegrotingPost-TarievenlijstItem_1']/option"));
        ListBegrotingsGroep.get(1).click();
        Thread.sleep(500);       
        
		StaticClass.driver.findElement(By.id(Field_Omschrijving)).sendKeys(omschrijving);
		StaticClass.driver.findElement(By.id(Field_FTE)).sendKeys(FTE);
		StaticClass.driver.findElement(By.id(Field_AantalMaanden)).sendKeys(aantalMaanden);
		Thread.sleep(500);
		StaticClass.driver.findElement(By.id(Field_StartSchaal)).clear();
		StaticClass.driver.findElement(By.id(Field_StartSchaal)).sendKeys(startSchaal);
		Thread.sleep(500);
		//StaticClass.driver.findElement(By.id(Field_Totaal)).clear();
		//StaticClass.driver.findElement(By.id(Field_Totaal)).sendKeys(totaal);	
		//Field_MainForm.click();
		//Thread.sleep(800);
	}
	
	public AanvraagObjects_Organisaties clickNext(){
		Field_Verder_2.click();
		WebDriverWait wait = new WebDriverWait(StaticClass.driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-rb-link_1")));
		return new AanvraagObjects_Organisaties();
	}
	
	
}
