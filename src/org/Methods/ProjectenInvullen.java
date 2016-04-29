package org.Methods;

import org.Aanvrager.AanvraagObjects_AanvraagTab;
import org.Aanvrager.AanvraagObjects_Algemeen;
import org.Aanvrager.AanvraagObjects_Bevestiging;
import org.Aanvrager.AanvraagObjects_Details;
import org.Aanvrager.AanvraagObjects_NonReferenten;
import org.Aanvrager.AanvraagObjects_Organisaties;
import org.Aanvrager.AanvraagObjects_VraagBegroting;
import org.Aanvrager.Relatiebeheer.RelatiebeheerObjects_ZoekenOrganisatie;
import org.Projecten.Project_Projecten;
import org.Shared.BaseMenuMethods;
import org.Shared.ISAAC_HomePage;
import org.Shared.ISAAC_LoginPageObject;
import org.openqa.selenium.WebDriver;
import org.Shared.StaticClass;

public class ProjectenInvullen extends StaticClass {
	
	@Override
	public WebDriver getDriver() {
		return super.getDriver();
	}
	
	public static void projectInvullen(String username, String password, String aanvraagTitel) throws InterruptedException{
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
		Project_Projecten project = new Project_Projecten();
		// Ga naar ISAAC
		driver.get("https://nwo.acc.isaac.spinozanet.nl/nl/");

		//Aanmelden
		loginPage.setText_TaalNederlands();	
		loginPage.setText_UsernameLogin(username);
		loginPage.setText_PasswordLogin(password);
		loginPage.ClickLogin();
			
		// Ga naar de aanvraag pagina
		menu.goToProjectenPageNL();
		project.setText_Field_Filter(aanvraagTitel);
	}
}
