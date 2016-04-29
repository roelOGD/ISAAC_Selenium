package org.Tests;

import org.Methods.NewStandaardAanvraag;
import org.Methods.ProjectenInvullen;
import org.POM.data.ISAAC_Data;
import org.Shared.CredentialsOpvragen;
import org.Shared.StaticClass;
import org.openqa.selenium.WebDriver;

public class ISAAC_LoginPageTest extends StaticClass{
		
		@Override
		public WebDriver getDriver() {
			return super.getDriver();
		}
		
		public static void main (String[] args) throws InterruptedException{
			CredentialsOpvragen credentials = new CredentialsOpvragen();
			String[] gegevens = credentials.displayGUI();
			String aanvragerUsername = gegevens[0];
			String aanvragerPassword = gegevens[1];
			String adminUsername = gegevens[2];
			String adminPassword = gegevens[3];
			String aanvraagTitel = gegevens[4];				
			
			
			ISAAC_Data data = new ISAAC_Data();
			
			//NewStandaardAanvraag.NewStandaardAanvraagMaken(aanvragerUsername, aanvragerPassword, data.AANVRAAG_URL, data.VOORBEELD_DOCUMENT_PDF, aanvraagTitel);
			//Aanvraag_Acties.aanvraagWeerwoordIndienen(data.AANVRAGER_USERNAME, data.AANVRAGER_PASSWORD, data.AANVRAAGTITEL);
			//Aanvraag_Acties.aanvraagIntrekken(data.AANVRAGER_USERNAME, data.AANVRAGER_PASSWORD, data.AANVRAAGTITEL);
			//ProjectenInvullen.projectInvullen(data.AANVRAGER_USERNAME, data.AANVRAGER_PASSWORD,  "aanvraag 2");
			
		}
		
		
		
}
