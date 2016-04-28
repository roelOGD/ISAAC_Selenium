package org.Tests;

import org.Aanvrager.AanvraagObjects_Algemeen;
import org.Aanvrager.AanvraagObjects_Bevestiging;
import org.Aanvrager.AanvraagObjects_NonReferenten;
import org.Aanvrager.AanvraagObjects_Organisaties;
import org.Aanvrager.AanvraagObjects_VraagBegroting;
import org.Aanvrager.Relatiebeheer.RelatiebeheerObjects_ZoekenOrganisatie;
import org.Methods.NewStandaardAanvraag;
import org.Shared.BaseMenuMethods;
import org.Shared.ISAAC_HomePage;
import org.Shared.ISAAC_LoginPageObject;
import org.Shared.StaticClass;
import org.openqa.selenium.WebDriver;

public class ISAAC_LoginPageTest extends StaticClass{
		
	
		@Override
		public WebDriver getDriver() {
			return super.getDriver();
		}

		public static void main (String[] args) throws InterruptedException{

			NewStandaardAanvraag aanvraag = new NewStandaardAanvraag();
			aanvraag.NewStandaardAanvraag();
		

		} 
}
