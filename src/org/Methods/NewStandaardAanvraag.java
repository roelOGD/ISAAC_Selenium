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

	public static void NewStandaardAanvraag() throws InterruptedException{
	
	// Ga naar ISAAC
	driver.navigate().to("https://nwo.acc.isaac.spinozanet.nl/nl/");

	// Object for the loginpage
	ISAAC_LoginPageObject loginPage = new ISAAC_LoginPageObject();
	AanvraagObjects_Algemeen aanvraag = new AanvraagObjects_Algemeen();
	AanvraagObjects_VraagBegroting vraagBegroting = new AanvraagObjects_VraagBegroting();
	AanvraagObjects_Organisaties organisaties = new AanvraagObjects_Organisaties();
	AanvraagObjects_NonReferenten nonReferenten = new AanvraagObjects_NonReferenten();
	AanvraagObjects_Bevestiging bevestiging =  new AanvraagObjects_Bevestiging();
	RelatiebeheerObjects_ZoekenOrganisatie zoekenRelatiebeheer = new RelatiebeheerObjects_ZoekenOrganisatie();
	BaseMenuMethods menu = new BaseMenuMethods();
	ISAAC_HomePage homePage = new ISAAC_HomePage();
	
	//Aanmelden
	loginPage.setText_UsernameLogin("piet");
	loginPage.setText_PasswordLogin("");
	loginPage.ClickLogin();
		
	menu.goToSpecifiekeAanvraag("https://nwo.acc.isaac.spinozanet.nl/subsidieaanvraag?extref=1604265");
		
	
	aanvraag.setText_AanvraagTitle_1("Aanvraag - " +  randomNumber);
	aanvraag.setText_AanvraagSamenvatting_1("Dit is een automatisch gegenereerde aanvraag");
	aanvraag.setText_AanvraagStartdatumGepland_1("01-01-2019");
	aanvraag.setText_AanvraagEinddatumGepland_1("01-01-2020");
	aanvraag.uploadDocument_Field_Uploaden_1_1(PDF_Document);
	aanvraag.clickNext();
	
	
	aanvraag.setText_TabbladAlgemeen("H:\\Data\\ISAAC\\Voorbeeld Documenten\\voorbeeld.pdf");
			
	vraagBegroting.setText_TabbladVraagBegroting();
			
	organisaties.setText_TabbladOrganisaties();
			
	zoekenRelatiebeheer.setText_TabbladZoekenOrganisaties();
	
	organisaties.clickNext();
	nonReferenten.setText_TabbladNonReferenten();
	bevestiging.setText_TabbladBevestigen();
	}
}