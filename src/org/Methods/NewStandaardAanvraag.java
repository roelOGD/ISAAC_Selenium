package org.Methods;

import org.Aanvrager.AanvraagObjects_Algemeen;
import org.Aanvrager.AanvraagObjects_Bevestiging;
import org.Aanvrager.AanvraagObjects_NonReferenten;
import org.Aanvrager.AanvraagObjects_Organisaties;
import org.Aanvrager.AanvraagObjects_VraagBegroting;
import org.Aanvrager.Relatiebeheer.RelatiebeheerObjects_ZoekenOrganisatie;
import org.Shared.BaseMenuMethods;
import org.Shared.ISAAC_HomePage;
import org.Shared.ISAAC_LoginPageObject;
import org.Shared.StaticClass;
import org.openqa.selenium.WebDriver;

public class NewStandaardAanvraag extends StaticClass {

	@Override
	public WebDriver getDriver() {
		return super.getDriver();
	}

	public static void NewStandaardAanvraagMaken(String username, String password, String aanvraagUrl, String voorbeeldDocumentPdf) throws InterruptedException{
	
	// Initialiseer de objecten
	ISAAC_LoginPageObject loginPage = new ISAAC_LoginPageObject();
	AanvraagObjects_Algemeen aanvraag = new AanvraagObjects_Algemeen();
	AanvraagObjects_VraagBegroting vraagBegroting = new AanvraagObjects_VraagBegroting();
	AanvraagObjects_Organisaties organisaties = new AanvraagObjects_Organisaties();
	AanvraagObjects_NonReferenten nonReferenten = new AanvraagObjects_NonReferenten();
	AanvraagObjects_Bevestiging bevestiging =  new AanvraagObjects_Bevestiging();
	RelatiebeheerObjects_ZoekenOrganisatie zoekenRelatiebeheer = new RelatiebeheerObjects_ZoekenOrganisatie();
	BaseMenuMethods menu = new BaseMenuMethods();
	ISAAC_HomePage homePage = new ISAAC_HomePage();
	
	// Ga naar ISAAC
	driver.navigate().to("https://nwo.acc.isaac.spinozanet.nl/nl/");

	//Aanmelden
	loginPage.setText_TaalNederlands();	
	loginPage.setText_UsernameLogin(username);
	loginPage.setText_PasswordLogin(password);
	loginPage.ClickLogin();
		
	// Navigeer naar de juiste aanvraag
	menu.goToSpecifiekeAanvraag(aanvraagUrl);
		
	// Vul het tabblad algemeen in op de aanvraag
	aanvraag.setText_AanvraagTitle_1("Aanvraag - Automatisch");
	aanvraag.setText_AanvraagSamenvatting_1("Dit is een automatisch gegenereerde aanvraag");
	aanvraag.setText_AanvraagStartdatumGepland_1("01-01-2019");
	aanvraag.setText_AanvraagEinddatumGepland_1("01-01-2020");
	aanvraag.uploadDocument_Field_Uploaden_1_1(voorbeeldDocumentPdf);
	aanvraag.clickNext();
	
	// Vul de vraagbegroting van de aanvraag in 
	vraagBegroting.clickTarievenLijst_chckbx();
	vraagBegroting.AddVraagBegrotingItem(1, "begrotingsGroep", "omschrijving", "1", "12","1", "123456");
	vraagBegroting.clickNext();	

	// Klik op de knop "verantwoordelijke organisatie". Vervolgens wordt het zoekscherm geopend
	organisaties.toevoegenVerwantwoordelijkeOrganisatie();
			
	// Zoek in het zoekscherm naar de organisatie en klik deze aan
	zoekenRelatiebeheer.setText_Organisatieacroniem("eur");
	zoekenRelatiebeheer.clickZoekbtn();
	zoekenRelatiebeheer.clickSearchItem();
	//zoekenRelatiebeheer.clickTerugbtn();
	
	// Ga naar het tabblad nonReferenten
	organisaties.clickNext();
	
	// Vul het tabblad nonReferenten in
	nonReferenten.clickChkbxNonReferenten();
	nonReferenten.clickNext();
	
	// Vul het tabblad bevestigen in
	bevestiging.clickChkbxAanvraagOndertekendn();
	bevestiging.clickNext();
	}
}