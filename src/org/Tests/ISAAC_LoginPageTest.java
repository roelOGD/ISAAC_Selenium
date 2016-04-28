package org.Tests;

import org.Methods.NewStandaardAanvraag;
import org.Shared.StaticClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ISAAC_LoginPageTest extends StaticClass{
		
		private static final String USERNAME = "piet";
		private static final String PASSWORD = "";
		private static final String VOORBEELD_DOCUMENT_PDF = "H:\\Data\\ISAAC\\Voorbeeld Documenten\\voorbeeld.pdf";
		private static final String AANVRAAG_URL =  "https://nwo.acc.isaac.spinozanet.nl/subsidieaanvraag?extref=1604265"; 
		

		@Override
		public WebDriver getDriver() {
			return super.getDriver();
		}

		@Test
		public static void main (String[] args) throws InterruptedException{
			// Maak een nieuwe aanvraag met alle standaard waarden.
			NewStandaardAanvraag.NewStandaardAanvraagMaken(USERNAME, PASSWORD, AANVRAAG_URL, VOORBEELD_DOCUMENT_PDF);
		} 
		
		
}
