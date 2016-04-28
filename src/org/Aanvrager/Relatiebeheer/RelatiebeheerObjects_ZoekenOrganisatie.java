package org.Aanvrager.Relatiebeheer;

import java.util.List;

import javax.xml.xpath.XPath;

import org.Aanvrager.AanvraagObjects_NonReferenten;
import org.Aanvrager.AanvraagObjects_Organisaties;
import org.Aanvrager.AanvraagObjects_VraagBegroting;
import org.Shared.StaticClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RelatiebeheerObjects_ZoekenOrganisatie {

	public RelatiebeheerObjects_ZoekenOrganisatie(){
		PageFactory.initElements(StaticClass.driver, this);
	}
	
	@FindBy(id="organisatienaam")	public WebElement Field_Naam;	
	@FindBy(id="organisatieacroniem")	public WebElement Field_Acroniem;	
	@FindBy(xpath="//input[@value='Zoeken']") List<WebElement> btnZoek;
	@FindBy(xpath="//input[@value='Terug']") List<WebElement> btnTerug;

	//@FindBy(name="back")	public WebElement Field_Terug;	
	
	
	// Met deze method wordt automatisch alle velden van het tabblad algemeen ingevuld
	// Alleen de verplichte velden
	public AanvraagObjects_NonReferenten setText_TabbladZoekenOrganisaties() throws InterruptedException {
		setText_Organisatieacroniem("eur");
		clickZoekbtn();
		clickSearchItem();
		//clickTerugbtn();
		return null;
	}
	
	public void setText_TabbladZoekenOrganisaties_terugNaarOrganisaties() throws InterruptedException {
		setText_Organisatieacroniem("eur");
		clickZoekbtn();
		clickSearchItem();
		//clickTerugbtn();
	}
	
	public void setText_Organisatieacroniem(String text){
		Field_Acroniem.sendKeys(text);
		Assert.assertEquals(Field_Acroniem.getAttribute("value"), text);
	}
	
	public void clickZoekbtn() throws InterruptedException{
		btnZoek.get(0).click();
		WebDriverWait wait = new WebDriverWait(StaticClass.driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("organisatie")));		
	}
	
	public AanvraagObjects_Organisaties clickTerugbtn() throws InterruptedException{
		btnTerug.get(0).click();
		WebDriverWait wait = new WebDriverWait(StaticClass.driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-rb-link_1")));
		return new AanvraagObjects_Organisaties();
	}
	
	public AanvraagObjects_Organisaties clickSearchItem(){
		Actions action = new Actions(StaticClass.driver);
		List<WebElement> we = StaticClass.driver.findElements(By.xpath("//td[@class='table-column']"));
		WebElement eerste = we.get(1);
		action.moveToElement(eerste).moveToElement(StaticClass.driver.findElement(By.id("select1"))).click().build().perform();
		WebDriverWait wait = new WebDriverWait(StaticClass.driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("button-rb-link_1")));
		return new AanvraagObjects_Organisaties();
	}
}
