package org.Methods;

import org.Aanvrager.AanvraagObjects_Algemeen;
import org.Aanvrager.AanvraagObjects_Bevestiging;
import org.Aanvrager.AanvraagObjects_Details;
import org.Aanvrager.AanvraagObjects_NonReferenten;
import org.Aanvrager.AanvraagObjects_Organisaties;
import org.Aanvrager.AanvraagObjects_VraagBegroting;
import org.Aanvrager.Relatiebeheer.RelatiebeheerObjects_ZoekenOrganisatie;
import org.Admin.AdminObjects_AanvragenHomePage;
import org.Admin.AdminObjects_AanvragenSpecifiekeAanvraagHomePage;
import org.Admin.AdminObjects_AanvragenSpecifiekeAanvraagOntvankelijkheid;
import org.Admin.AdminObjects_AanvragenSpecifiekeAanvraagOntvankelijkheidValidatie;
import org.Admin.AdminObjects_AanvragenSpecifiekeAanvraagOverzicht;
import org.Admin.AdminObjects_AanvragenSpecifiekeRondeHomepage;
import org.Shared.BaseMenuMethods;
import org.Shared.BaseMethodsClass;
import org.Shared.ISAAC_HomePage;
import org.Shared.ISAAC_LoginPageObject;
import org.Shared.StaticClass;
import org.openqa.selenium.WebDriver;

import org.Admin.test;


public class testMethod extends StaticClass {
	
	@Override
	public WebDriver getDriver() {
		return super.getDriver();
	}
	
	public static void test() throws InterruptedException{
		
		// Initialiseer de objecten
		ISAAC_LoginPageObject loginPage = new ISAAC_LoginPageObject();
		AanvraagObjects_Algemeen aanvraag = new AanvraagObjects_Algemeen();
		AanvraagObjects_VraagBegroting vraagBegroting = new AanvraagObjects_VraagBegroting();
		AanvraagObjects_Organisaties organisaties = new AanvraagObjects_Organisaties();
		AanvraagObjects_NonReferenten nonReferenten = new AanvraagObjects_NonReferenten();
		AanvraagObjects_Bevestiging bevestiging =  new AanvraagObjects_Bevestiging();
		RelatiebeheerObjects_ZoekenOrganisatie zoekenRelatiebeheer = new RelatiebeheerObjects_ZoekenOrganisatie();
		AdminObjects_AanvragenHomePage aanvraagTab = new AdminObjects_AanvragenHomePage();
		AanvraagObjects_Details aanvraagDetails = new AanvraagObjects_Details();
		AdminObjects_AanvragenSpecifiekeRondeHomepage specifiekeRonde = new AdminObjects_AanvragenSpecifiekeRondeHomepage();
		AdminObjects_AanvragenSpecifiekeAanvraagHomePage specifiekeAanvraag = new AdminObjects_AanvragenSpecifiekeAanvraagHomePage();
		AdminObjects_AanvragenSpecifiekeAanvraagOverzicht specifiekeAanvraagOverzichtTab = new AdminObjects_AanvragenSpecifiekeAanvraagOverzicht();
		AdminObjects_AanvragenSpecifiekeAanvraagOntvankelijkheid specifiekeAanvraagOntvankelijkheidTab = new AdminObjects_AanvragenSpecifiekeAanvraagOntvankelijkheid();
		AdminObjects_AanvragenSpecifiekeAanvraagOntvankelijkheidValidatie specifiekeAanvraagOntvankelijkheidTabValidatie = new AdminObjects_AanvragenSpecifiekeAanvraagOntvankelijkheidValidatie();
		BaseMenuMethods menu = new BaseMenuMethods();
		ISAAC_HomePage homePage = new ISAAC_HomePage();
		Uitloggen uitloggen = new Uitloggen();
		
		test test = new test();
		
		// Ga naar ISAAC
		driver.get("https://nwo.acc.isaac.spinozanet.nl/nl/");

		//Aanmelden
		loginPage.setText_TaalNederlands();	
		loginPage.setText_UsernameLogin("test");
		loginPage.setText_PasswordLogin("test");

		
		test.kliklogin();
		
	};
}
