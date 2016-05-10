package org.Methods;

import org.openqa.selenium.WebDriver;
import org.Aanvrager.AanvraagObjects_AanvraagTab;
import org.Aanvrager.AanvraagObjects_Algemeen;
import org.Aanvrager.AanvraagObjects_Bevestiging;
import org.Aanvrager.AanvraagObjects_Details;
import org.Aanvrager.AanvraagObjects_NonReferenten;
import org.Aanvrager.AanvraagObjects_Organisaties;
import org.Aanvrager.AanvraagObjects_VraagBegroting;
import org.Aanvrager.Relatiebeheer.AanvragerKoppelenAanWerkzaamheidHomePage;
import org.Aanvrager.Relatiebeheer.RelatiebeheerObjects_ZoekenOrganisatie;
import org.Admin.AdminObjects_AanvragenHomePage;
import org.Admin.AdminObjects_AanvragenSpecifiekeAanvraagHomePage;
import org.Admin.AdminObjects_AanvragenSpecifiekeAanvraagOntvankelijkheid;
import org.Admin.AdminObjects_AanvragenSpecifiekeAanvraagOntvankelijkheidValidatie;
import org.Admin.AdminObjects_AanvragenSpecifiekeAanvraagOverzicht;
import org.Admin.AdminObjects_AanvragenSpecifiekeRondeHomepage;
import org.Shared.BaseMenuMethods;
import org.Shared.ISAAC_HomePage;
import org.Shared.ISAAC_LoginPageObject;
import org.Shared.StaticClass;

public class Aanvraag_Acties extends StaticClass{
	
	@Override
	public WebDriver getDriver() {
		return super.getDriver();
	}
	
	public static void aanvraagIntrekken(String username, String password, String aanvraagTitel) throws InterruptedException{
		// Initialiseer de objecten
		ISAAC_LoginPageObject loginPage = new ISAAC_LoginPageObject();
		AanvraagObjects_Algemeen aanvraag = new AanvraagObjects_Algemeen();
		AanvraagObjects_VraagBegroting vraagBegroting = new AanvraagObjects_VraagBegroting();
		AanvraagObjects_Organisaties organisaties = new AanvraagObjects_Organisaties();
		AanvraagObjects_NonReferenten nonReferenten = new AanvraagObjects_NonReferenten();
		AanvraagObjects_Bevestiging bevestiging =  new AanvraagObjects_Bevestiging();
		RelatiebeheerObjects_ZoekenOrganisatie zoekenRelatiebeheer = new RelatiebeheerObjects_ZoekenOrganisatie();
		AanvraagObjects_AanvraagTab aanvraagTab = new AanvraagObjects_AanvraagTab();
		AanvraagObjects_Details aanvraagDetails = new AanvraagObjects_Details();
		BaseMenuMethods menu = new BaseMenuMethods();
		ISAAC_HomePage homePage = new ISAAC_HomePage();
		Uitloggen uitloggen = new Uitloggen();
		// Ga naar ISAAC
		driver.get("https://nwo.acc.isaac.spinozanet.nl/nl/");

		//Aanmelden
		loginPage.setText_TaalNederlands();	
		loginPage.setText_UsernameLogin(username);
		loginPage.setText_PasswordLogin(password);
		loginPage.ClickLogin();
			
		// Ga naar de aanvraag pagina
		menu.goToAanvragenPageNL();
		aanvraagTab.zoekOpAanvraag(aanvraagTitel);
		aanvraagDetails.AanvraagIntrekken();
		uitloggen.uitloggen();
		
	}
	
	public static void aanvraagWeerwoordIndienen(String username, String password, String aanvraagTitel) throws InterruptedException{
		// Initialiseer de objecten
		ISAAC_LoginPageObject loginPage = new ISAAC_LoginPageObject();
		AanvraagObjects_Algemeen aanvraag = new AanvraagObjects_Algemeen();
		AanvraagObjects_VraagBegroting vraagBegroting = new AanvraagObjects_VraagBegroting();
		AanvraagObjects_Organisaties organisaties = new AanvraagObjects_Organisaties();
		AanvraagObjects_NonReferenten nonReferenten = new AanvraagObjects_NonReferenten();
		AanvraagObjects_Bevestiging bevestiging =  new AanvraagObjects_Bevestiging();
		RelatiebeheerObjects_ZoekenOrganisatie zoekenRelatiebeheer = new RelatiebeheerObjects_ZoekenOrganisatie();
		AanvraagObjects_AanvraagTab aanvraagTab = new AanvraagObjects_AanvraagTab();
		AanvraagObjects_Details aanvraagDetails = new AanvraagObjects_Details();
		BaseMenuMethods menu = new BaseMenuMethods();
		ISAAC_HomePage homePage = new ISAAC_HomePage();
		Uitloggen uitloggen = new Uitloggen();
		// Ga naar ISAAC
		driver.get("https://nwo.acc.isaac.spinozanet.nl/nl/");

		//Aanmelden
		loginPage.setText_TaalNederlands();	
		loginPage.setText_UsernameLogin(username);
		loginPage.setText_PasswordLogin(password);
		loginPage.ClickLogin();
			
		// Ga naar de aanvraag pagina
		menu.goToAanvragenPageNL();
		aanvraagTab.zoekOpAanvraag(aanvraagTitel);
		aanvraagDetails.weerwoordIndienen();
	}
	
	public static void afzienVanWeerwoord(String username, String password, String aanvraagTitel) throws InterruptedException{
		// Initialiseer de objecten
		ISAAC_LoginPageObject loginPage = new ISAAC_LoginPageObject();
		AanvraagObjects_Algemeen aanvraag = new AanvraagObjects_Algemeen();
		AanvraagObjects_VraagBegroting vraagBegroting = new AanvraagObjects_VraagBegroting();
		AanvraagObjects_Organisaties organisaties = new AanvraagObjects_Organisaties();
		AanvraagObjects_NonReferenten nonReferenten = new AanvraagObjects_NonReferenten();
		AanvraagObjects_Bevestiging bevestiging =  new AanvraagObjects_Bevestiging();
		RelatiebeheerObjects_ZoekenOrganisatie zoekenRelatiebeheer = new RelatiebeheerObjects_ZoekenOrganisatie();
		AanvraagObjects_AanvraagTab aanvraagTab = new AanvraagObjects_AanvraagTab();
		AanvraagObjects_Details aanvraagDetails = new AanvraagObjects_Details();
		BaseMenuMethods menu = new BaseMenuMethods();
		ISAAC_HomePage homePage = new ISAAC_HomePage();
		Uitloggen uitloggen = new Uitloggen();
		// Ga naar ISAAC
		driver.get("https://nwo.acc.isaac.spinozanet.nl/nl/");

		//Aanmelden
		loginPage.setText_TaalNederlands();	
		loginPage.setText_UsernameLogin(username);
		loginPage.setText_PasswordLogin(password);
		loginPage.ClickLogin();
			
		// Ga naar de aanvraag pagina
		menu.goToAanvragenPageNL();
		aanvraagTab.zoekOpAanvraag(aanvraagTitel);
		aanvraagDetails.afzienVanWeerwoord();
	}
	
	public static void aanvraagOntvankelijkVerklaren(String username, String password, String rondeTitel, String aanvraagTitel) throws InterruptedException{
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
		AanvragerKoppelenAanWerkzaamheidHomePage koppelAanvragerWerkzaamheid = new AanvragerKoppelenAanWerkzaamheidHomePage();
		// Ga naar ISAAC
		driver.get("https://nwo.acc.isaac.spinozanet.nl/nl/");

		//Aanmelden
		loginPage.setText_TaalNederlands();	
		loginPage.setText_UsernameLogin(username);
		loginPage.setText_PasswordLogin(password);
		loginPage.ClickLogin();
			
		// Ga naar de aanvraag pagina
		menu.goToAanvragenPageNLAdmin();
		aanvraagTab.zoekOpRonde(rondeTitel);
		specifiekeRonde.gaNaarAanvragen();

		specifiekeAanvraag.zoekEnKlikOpAanvraag(aanvraagTitel);
		specifiekeAanvraagOverzichtTab.gaNaarOntvankelijkheidTab();
		specifiekeAanvraagOntvankelijkheidTab.gaNaarValidatieScherm();
		specifiekeAanvraagOntvankelijkheidTabValidatie.chckbx_Aanvrager_gevalideerd_JA();
		specifiekeAanvraagOntvankelijkheidTabValidatie.chckbx_Aanvraag_Check_Inhoudelijk_JA();
		specifiekeAanvraagOntvankelijkheidTabValidatie.chckbx_Aanvraag_Check_Financieel_JA();
		specifiekeAanvraagOntvankelijkheidTabValidatie.btnKoppelWerkzaamheidClick();
		koppelAanvragerWerkzaamheid.koppelWerkzaamheid();
		specifiekeAanvraagOntvankelijkheidTabValidatie.btnVastleggenClick();
		specifiekeAanvraagOntvankelijkheidTab.verklaarOntvankelijk();
		specifiekeAanvraagOntvankelijkheidTab.vastleggen();
		
	}
}
