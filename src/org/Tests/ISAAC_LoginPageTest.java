package org.Tests;

import org.Methods.Aanvraag_Acties;
import org.Methods.NewStandaardAanvraag;
import org.Methods.ProjectenInvullen;
import org.Methods.testMethod;
import org.POM.data.ISAAC_Data;
import org.Shared.GegevensOpvragen;
import org.Shared.StaticClass;
import org.openqa.selenium.WebDriver;

public class ISAAC_LoginPageTest extends StaticClass{
		
		@Override
		public WebDriver getDriver() {
			return super.getDriver();
		}
		
		public static void main (String[] args) throws InterruptedException{
			GegevensOpvragen gegevensObject = new GegevensOpvragen();
			String[] gegevens = gegevensObject.displayGUI();
			String aanvragerUsername = gegevens[0];
			String aanvragerPassword = gegevens[1];
			String adminUsername = gegevens[2];
			String adminPassword = gegevens[3];
			String aanvraagTitel = gegevens[4];				
			String aanvraagURL = gegevens[5];	
			String rondeTitel = gegevens[6];		

			ISAAC_Data data = new ISAAC_Data();
			
			//NewStandaardAanvraag.NewStandaardAanvraagMaken(aanvragerUsername, aanvragerPassword, data.AANVRAAG_URL, data.VOORBEELD_DOCUMENT_PDF, aanvraagTitel);
			//Aanvraag_Acties.aanvraagWeerwoordIndienen(data.AANVRAGER_USERNAME, data.AANVRAGER_PASSWORD, data.AANVRAAGTITEL);
			//Aanvraag_Acties.aanvraagIntrekken(data.AANVRAGER_USERNAME, data.AANVRAGER_PASSWORD, data.AANVRAAGTITEL);
			//ProjectenInvullen.projectInvullen(data.AANVRAGER_USERNAME, data.AANVRAGER_PASSWORD,  "aanvraag 2");
			//Aanvraag_Acties.aanvraagOntvankelijkVerklaren(adminUsername, adminPassword, rondeTitel, aanvraagTitel);
			Aanvraag_Acties.aanvraagOntvankelijkVerklaren(adminUsername, adminPassword, "1604265 - ronde 1", "aanvraag 8888");
			//testMethod.test();
  
		}
		
		
		
}
